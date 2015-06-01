package com.bozana.si.transformer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.MessageBuilder;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "/spring_integration/app_context.xml");

		HelloWorldGW service = context.getBean("helloWorld", HelloWorldGW.class);
		String inMsg = "Hello, how are you?";
		System.out.println("*** Main: inMsg=" + inMsg);
		String outMsg = service.sayHello(inMsg);
		System.out.println("*** Main: outMsg=" + outMsg);
        context.close();
	}

}
