package edu.upc.dsa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class Covid19TestMuestra {

    @Before
    public void setUp() {

        Covid19ManagerImple.getInstance().afegirMuestra("Gabri","Donate Alcober","Muestra1",new Date (2020,11,23),"negativo","todo perfecto" ,"User1");
        Covid19ManagerImple.getInstance().afegirMuestra("Uri","Donate Alcober","Muestra2",new Date (2020,11,24),"negativo","todo perfecto","User2");



    }


    @Test
    public void AñadirMuestra() {


        Covid19ManagerImple.getInstance().afegirMuestra("Toni","Oller","Muestra3",new Date (2020,11,22),"negativo","todo perfecto" ,"User3");

        assertEquals(3, Covid19ManagerImple.getInstance().sizeMuestras());

    }


    @After
    public void tearDown() { Covid19ManagerImple.getInstance().delete();}

}
