package com.bozana.hello;

public class HelloWorldImpl {

	public String sayHello(String name) {
		String retStr = "Hello " + name;
		System.out.println("sending: " + retStr);
		return retStr;
	}

}
