##  ServiceActivator Example

* Illustrates usage of service activator (HelloWorldSA)
* Service activator activates service when it receives a message in the requestChannel
* Look at the Main.java
* Message has been created & sent to the channel directly
* Channel has been obtained directly (from spring context) 
* I add manually message into the channel by calling send on the channel
* Main prints reply by directly accessing msg in responseChannel calling receive method

![alt tag](https://github.com/bozanarh/spring_integration_patterns/blob/master/1_serviceActivator/serviceActivator.jpeg)

