package com.bozana.si.serviceActivator;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.MessageBuilder;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "/spring_integration/app_context.xml");
		//sending msg
		MessageChannel channel = context.getBean("requestChannel", MessageChannel.class);
        Message<String> message = MessageBuilder.withPayload("Bozana").build();
        channel.send(message);
        
        PollableChannel outputChannel = context.getBean("responseChannel", PollableChannel.class);
        System.out.println("got: " + outputChannel.receive(0).getPayload());
        context.close();
	}

}
