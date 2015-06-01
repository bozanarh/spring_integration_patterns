## Hello world with EIP

* Using GW to achive lose coupling with spring integration (service activator). Instead of putting msg manually into the requestChannel, we call gateway interface. 
* You define only interface for the gateway; it does not have implementation. (*Note: HelloWorldSA in this example does not implement HelloWorldsGW - it does not have to*)
* You have to specify gateway methods in the spring context file if it has more than on method.
* Gateway serves as a fasade to the spring integration. It behaves like a proxy and behind the scene, it is putting message into requestChannel that is (in this example) received by service activator (HelloWorldSA). 
* Service activator activates object upon receiving message in the requestChannel. Then does its job, and sends reply back into the response channel.
* First look at the Main.java
* Gateway interface is called from the main()
* Look at the app_context.xml
* gateway's requestChannel is input into helloWorldSA (service activator)
* There is also channel intercepter (see ChannelDebugger). It intercepts messages in the requestChannel.

![alt tag](https://github.com/bozanarh/spring_integration_patterns/blob/master/2_gateway/gateway.jpeg)

