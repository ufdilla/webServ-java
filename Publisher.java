package webServ;

import javax.xml.ws.Endpoint;  
//Endpoint publisher  
public class Publisher{  
  public static void main(String[] args) {  
     Endpoint.publish("http://localhost:9090/ws/hello", new HelloWorldImpl());  
      }  
}  
