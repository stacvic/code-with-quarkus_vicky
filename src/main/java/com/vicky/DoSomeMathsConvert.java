package com.vicky;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/doSomeMathsConvert")
public class DoSomeMathsConvert {


    @GET
    @Path("/add/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public int doSomeMaths(@PathParam("id") int userNumber) {
        try {
            return 42;
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    @GET
    @Path("/minus/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public int doSomeMathsMinus(@PathParam("id") int userNumber) {
        try {
            return -42;
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }

    }
}
