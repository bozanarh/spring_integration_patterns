package com.bozana.si.router;

public class SerbianTranslator implements Translator {

	public String sayHello(String name) {
		StringBuilder str = new StringBuilder();
		str.append("Zdravo ")
			.append(name)
			.append("! Kako si?");
		return str.toString();
	}

}
