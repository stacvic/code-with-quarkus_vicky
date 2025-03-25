package com.vicky.controller;

import com.fasterxml.jackson.core.util.JacksonFeature;
import com.vicky.dto.CustomerAddress;
import com.vicky.dto.CustomerName;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/user")
    public class CustomerAddressController {


    @PUT
    @Path("/updateAddress/{customerName}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateAddress(@PathParam("customerName") String customerName,
                                  CustomerAddress customerAddress) {
        // Business logic to update the customer's address
        boolean success = updateCustomerAddress(customerName, customerAddress);

        if (success) {
            return Response.status(Response.Status.OK).entity("Address updated successfully").build();
        } else {
            return Response.status(Response.Status.BAD_REQUEST).entity("Update failed").build();
        }
    }

    // Hypothetical method to process the update
    private boolean updateCustomerAddress(String customerName, CustomerAddress customerAddress) {
        // Logic to update address in the database
        System.out.println("Updating address for " + customerName + " to: "
                + customerAddress.getFirstLine() + ", " + customerAddress.getPostCode());
        return true; // Return true/false based on the outcome of the operation
    }

}


