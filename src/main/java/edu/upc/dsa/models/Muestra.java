package edu.upc.dsa.models;

import java.util.Date;

public class Muestra {

    String name;
    String surname;
    String idMuestra;
    Date fechaMuestra;/** Dato para ordenar  */
    String clasificacion; /** Dato para ordeanr;*/
    String comentario;
    String idUser;



    public Muestra(){} /* Constructor Vacio*/

    public Muestra(String name, String surname, String idMuestra, Date fechaMuestra, String clasificacion, String comentario, String idUser) {
        this.name = name;
        this.surname = surname;
        this.idMuestra = idMuestra;
        this.fechaMuestra = fechaMuestra;
        this.clasificacion = clasificacion;
        this.comentario = comentario;
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

    public String getIdMuestra() {
        return idMuestra;
    }

    public void setIdMuestra(String idMuestra) {
        this.idMuestra = idMuestra;
    }

    public Date getFechaMuestra() {
        return fechaMuestra;
    }

    public void setFechaMuestra(Date fechaMuestra) {
        this.fechaMuestra = fechaMuestra;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}




