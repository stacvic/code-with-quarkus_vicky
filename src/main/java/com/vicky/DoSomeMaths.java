package com.vicky;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/doSomeMaths/{id}")
public class DoSomeMaths{


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int doSomeMaths(@PathParam("id") int userNumber) {
        try {
            return userNumber * 2;
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
        
    }

}
