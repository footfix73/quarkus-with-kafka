package org.acme;

import org.acme.quarkus.events.producer.EmployeeProducer;
import org.acme.quarkus.model.Employee;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/emplovee")
@Produces (MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON    )
public class EmployeeResource {

    @Inject
    EmployeeProducer employeeProducer;

    @POST
    public Response createEmployee(@Valid Employee employee) {
        employeeProducer.createEmployee(employee);
        return Response.accepted().build();
    }
}