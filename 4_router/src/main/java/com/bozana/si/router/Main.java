package com.bozana.si.router;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;

//FIXME: TX: cannot have more than 1 param in its method. So, you cannot pass msg and language to the
//transofrmer, but you can pass header.
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "/spring_integration/app_context.xml");

		HelloWorldGW service = context.getBean("helloWorld", HelloWorldGW.class);
		String name="Bozana";
		String outMsg = service.sayHello(name, Language.GERMAN.value());
		System.out.println("*** Main (German): outMsg=" + outMsg);
		
		outMsg = service.sayHello(name, Language.SERBIAN.value());
		System.out.println("*** Main (Serbian): outMsg=" + outMsg);
		
        context.close();
	}

}
