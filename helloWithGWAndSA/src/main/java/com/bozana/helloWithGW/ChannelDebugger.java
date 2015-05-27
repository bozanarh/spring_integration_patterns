package com.bozana.helloWithGW;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptorAdapter;

// You can also extend this class, so you do not have to implement all methods:
public class ChannelDebugger extends ChannelInterceptorAdapter{
	public Message<?> preSend(Message<?> message, MessageChannel channel) {
		System.out.println("-- ChannelDebugger.preSend: Intercepting msg... paylod:" + message.getPayload().toString());
		return message;
	}
}
