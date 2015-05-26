## Hello world with EIP

* Ilustrates usage of service activator (HelloWorldImpl)
* Service activator activates service when it receives a message in the requestCahnnel
* Look at the Main.java
* Message has been created & sent to the channel directly
* Channel has been obtained directly (from spring context) 
* I manually add message into the channel by calling send on the channel
* Main prints reply by directly accessing msg in responseChannel calling receive method

![alt tag](https://github.com/bozanarh/spring_integration_patterns/blob/master/hello/eip_diagram.jpeg)

