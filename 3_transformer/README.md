## Hello world with EIP

* This example ilustrates usage of Message Treansformer.
* Transformer is used to transform message from one format to another. In this example, he is doing trivial thing - transforming all lower cases in the message into upper cases and sending message back.
* Using Gateway (HelloWorldService) to achive spring integration with the transformer (HelloWorldTransformer). 
* Gateway acts as a proxy to spring integration. We used it to achive lose coupling, so we do not need to call methods on the message cahnnel directly. Instead we just call method on gateway interface.
* First look at the Main.java, then look at the app_context.xml

![alt tag](https://github.com/bozanarh/spring_integration_patterns/blob/master/3_transformer/transformer.jpeg)

