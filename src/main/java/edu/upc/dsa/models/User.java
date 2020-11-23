package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;
import java.util.LinkedList;
import java.util.List;

public class User {
    String idUser;
    String name;
    String surname;
    int edad;
    String valoracion;

    public User(String idUser){ //Constructor vacío

    }
    //Constructor
    public User(String idUser, String name, String surname, int edad, String valoracion) {
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
        this.edad = edad;
        this.valoracion = valoracion;


    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }
}
