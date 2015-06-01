package com.bozana.si.serviceActivator;

public class HelloWorldImpl {

	public String sayHello(String name) {
		String retStr = "Hello " + name;
		System.out.println("sending: " + retStr);
		return retStr;
	}

}
