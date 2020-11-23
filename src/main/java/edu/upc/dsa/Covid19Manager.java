package edu.upc.dsa;

import edu.upc.dsa.models.Lab;
import edu.upc.dsa.models.User;
import edu.upc.dsa.models.Muestra;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public interface Covid19Manager {

    public User addUser(String IdUser); /*Añadira un nuevo brote y nos devuelve este mismo a modo de revisar*/
    public int size();
    public int sizeUsers();
    public int sizeMuestras();
    public List<Muestra> muestraUser(String idUser);
    public Muestra afegirMuestra(String name, String surname, String idMuestra, Date fechaMuestra, String clasificacion, String comentario, String idUser);
    public Lab addLab(String name);
    public List<Lab> findAll();
    public Lab getLab(String id);
    public Lab addLab(Lab t);
    public void deleteLab(String id);
    public Lab updateLab(Lab t);



}
