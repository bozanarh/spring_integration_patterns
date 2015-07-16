package com.bozana.si.router;

public class GermanTranslator implements Translator {

	public String sayHello(String name) {
		StringBuilder str = new StringBuilder();
		str.append("Hallo ")
			.append(name)
			.append("! Wie geht es dir?");
		return str.toString();
	}

}
