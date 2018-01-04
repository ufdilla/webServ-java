package webServ;

import javax.jws.WebService;  
//Service Implementation  
@WebService(endpointInterface = "webServ.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{  
  @Override  
  public String getHelloWorldAsString(String name) {  
      return "Hello World ";  
  }  
}  
