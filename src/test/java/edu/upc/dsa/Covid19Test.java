package edu.upc.dsa;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
public class Covid19Test {

    private HttpServer server;
    private WebTarget target;


    public void setUp() {
        Covid19ManagerImple.getInstance().addUser("User1");
        Covid19ManagerImple.getInstance().addUser("User2");
        Covid19ManagerImple.getInstance().addUser("User3");
        Covid19ManagerImple.getInstance().addUser("User4");

    }
    @Test
    public void CrearUser() {


        Covid19ManagerImple.getInstance().addUser("User5");
        assertEquals(5, Covid19ManagerImple.getInstance().sizeUsers());

    }

    @After
    public void tearDown() { Covid19ManagerImple.getInstance().delete();}

}
