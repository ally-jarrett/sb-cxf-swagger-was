package com.was.spring.cxf;

import javax.ws.rs.Path;
//import io.swagger.annotations.Api;

@Path("/sayHello")
//@Api("/sayHello")
public class HelloServiceImpl implements HelloService {
	
	public String sayHello(String a) {
        return "Hello " + a + ", Welcome to CXF RS Spring Boot World!!!";
    }

}
