package Test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class ApiHandler {
    @GET
    @Path("/getOutput")
    @Produces(MediaType.APPLICATION_JSON)
    public String getOutput() {
        return MainProgram.getOutput();
    }
}
