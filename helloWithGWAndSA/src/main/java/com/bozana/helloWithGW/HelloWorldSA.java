package com.bozana.helloWithGW;

public class HelloWorldSA {

	public String sayHello(String name) {
		String retStr = "Hello " + name;
		System.out.println("*** ServiceActivator get: " + name);
		System.out.println("*** ServiceActivator sending back: " + retStr);
		return retStr;
	}

}
