package edu.upc.dsa.services;

import edu.upc.dsa.Covid19Manager;
import edu.upc.dsa.Covid19ManagerImpl;
import edu.upc.dsa.models.Brote;
import edu.upc.dsa.models.Caso;
import edu.upc.dsa.models.Track;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
@Api(value = "/Bikes", description = "Endpoint to Text Service")
@Path("Bikes")
public class BikesService {
    private Covid19Manager cm;
}
