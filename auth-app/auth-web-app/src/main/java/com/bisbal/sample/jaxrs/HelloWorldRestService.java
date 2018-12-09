package com.bisbal.sample.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/helloService")
public class HelloWorldRestService {

    @GET
    @Path("/{name}")
    public String sayHello(@PathParam("name") String name) {
        return "hello:" + name;
    }

}
