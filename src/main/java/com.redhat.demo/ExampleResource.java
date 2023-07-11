package com.redhat.demo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("name") String name) {
        if (name == null || name.isBlank()) {
            name = "World";
        }
        return "Hello " + name;
    }
}