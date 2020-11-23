package edu.upc.dsa.services;

import edu.upc.dsa.Covid19Manager;
import edu.upc.dsa.Covid19ManagerImple;


import edu.upc.dsa.models.Lab;
import edu.upc.dsa.models.User;
import edu.upc.dsa.models.Muestra;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Api(value = "/Lab", description = "Endpoint to Lab Service")
@Path("/Lab")

public class LabService {
    private Covid19Manager tm;

    public LabService() {
        this.tm = Covid19ManagerImple.getInstance();
        if (tm.size()==0) {
            this.tm.addLab("A");
            this.tm.addLab("B");
            this.tm.addLab("C");
        }


    }

    @GET
    @ApiOperation(value = "get all Labs", notes = "dfsas")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Lab.class, responseContainer="List"),
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getLab() {

        List<Lab> tracks = this.tm.findAll();

        GenericEntity<List<Lab>> entity = new GenericEntity<List<Lab>>(tracks) {};
        return Response.status(201).entity(entity).build()  ;

    }

    @GET
    @ApiOperation(value = "get a Lab", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Lab.class),
            @ApiResponse(code = 404, message = "Lab not found")
    })
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTrack(@PathParam("id") String id) {
        Lab t = this.tm.getLab(id);
        if (t == null) return Response.status(404).build();
        else  return Response.status(201).entity(t).build();
    }

    @DELETE
    @ApiOperation(value = "delete a Lab", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 404, message = "Lab not found")
    })
    @Path("/{id}")
    public Response deleteTrack(@PathParam("id") String id) {
        Lab t = this.tm.getLab(id);
        if (t == null) return Response.status(404).build();
        else this.tm.deleteLab(id);
        return Response.status(201).build();
    }

    @PUT
    @ApiOperation(value = "update a Track", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 404, message = "Track not found")
    })
    @Path("/")
    public Response updateTrack(Lab lab) {

        Lab t = this.tm.updateLab(lab);

        if (t == null) return Response.status(404).build();

        return Response.status(201).build();
    }



    @POST
    @ApiOperation(value = "create a new Track", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response=Lab.class),
            @ApiResponse(code = 500, message = "Validation Error")

    })

    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newLab(Lab lab) {

        if (lab.getName()==null || lab.getName()==null)  return Response.status(500).entity(lab).build();
        this.tm.addLab(lab);
        return Response.status(201).entity(lab).build();
    }

    @Path("/muestra/{name}/{surname}/{idMuestra}/{diaMuestra}/{mesMuestra}/{añoMuestra}/{cLasificacion}/{idUser}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newMuestra (@PathParam("nombre")String name, @PathParam("apellido")String surname,@PathParam("idMuestra")String idMuestra,@PathParam("diaMuestra") int diaMuestra, @PathParam("mesMuestra") int mesMuestra,@PathParam("añoMuestra") int añoMuestra,@PathParam("clasificacion")String clasificacion,@PathParam("idBrote")String idBrote) {
        /* if (track.getSinger()==null || track.getTitle()==null)  return Response.status(500).entity(track).build();*/

        Date fechaMuestra = new Date(diaMuestra,mesMuestra,añoMuestra);

        Muestra muestra = this.cm.afegirMuestra( name, surname, idMuestra, diaMuestra, mesMuestra,añoMuestra,clasificacion,comentario,idUser);

        List  casos = this.cm.getBrote(idBrote).getCasosList();

        GenericEntity<List<Muestra>> entity = new GenericEntity<List<Muestra>>(muestras) {
        };
        return Response.status(201).entity(entity).build();
    }




}
