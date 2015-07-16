package com.bozana.si.router;

import org.springframework.integration.annotation.Header;

public interface HelloWorldGW { 
	String sayHello(String name, @Header("Language") String language);
}
