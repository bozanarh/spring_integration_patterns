package com.bozana.helloWithGW;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.MessageBuilder;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "/spring_integration/app_context.xml");

		HelloWorldService service = context.getBean("helloWorldGateway", HelloWorldService.class);
		String gotMsg = service.sayHello("Bozana");
		System.out.println("### got: " + gotMsg);
		
        context.close();
	}

}
