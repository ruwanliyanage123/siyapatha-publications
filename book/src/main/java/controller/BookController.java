package controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/book")
public class BookController {
    @Path("/create")
    @POST
    public Response createBook(){
        return Response.ok("Create API working", MediaType.APPLICATION_JSON).build();
    }

    @Path("/book/{isbn}")
    public Response getBookByISBN(@PathParam("isbn") String isbnNumber){
        System.out.println(isbnNumber);
        return Response.ok(isbnNumber, MediaType.APPLICATION_JSON).build();
    }
}
