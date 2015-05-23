## Hello world with EIP

* Look at the Main.java
* Channel obtained directlu (from spring context) 
* Message created & sent to the channel
* serviceActivator is HelloWorld. It receives msg and sends it back through responseChannel. 
* Main prints reply by directly accessing msg in responseChannel

![alt tag](https://github.com/bozanarh/spring_integration_patterns/blob/master/hello/eip_diagram.jpeg)

