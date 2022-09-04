package com.training.ws.rpc;

import javax.xml.ws.Service;

public class HelloWorldClient {
    public static void main(String[] args) throws Exception {
        java.net.URL url = new java.net.URL("http://localhost:7779/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        javax.xml.namespace.QName qname = new javax.xml.namespace.QName("http://rpc.ws.training.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);
        com.training.ws.rpc.HelloWorld hello = service.getPort(com.training.ws.rpc.HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("java-ws rpc"));

    }

}