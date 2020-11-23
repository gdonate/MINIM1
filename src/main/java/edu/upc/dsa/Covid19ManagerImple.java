package edu.upc.dsa;

import edu.upc.dsa.models.Lab;
import edu.upc.dsa.models.Muestra;
import edu.upc.dsa.models.User;
import edu.upc.dsa.models.Caso;
import org.apache.log4j.Logger;

import java.util.*;

public class Covid19ManagerImple implements Covid19Manager{


    private static Covid19ManagerImple manager; /* SINGLETONE*/

    static final Logger logger = Logger.getLogger(Covid19ManagerImple.class.getName());

    HashMap<String, User> usuarios;
    List<Muestra> muestras ;
    String id;
    List<Muestra> muestrasUsers;
    List<Lab> labs;




    private Covid19ManagerImple(){
        /* Señalizamos las estructuras de datos */

        this.usuarios = new HashMap<String, User>();
        this.muestras  = new LinkedList<Muestra>();
        this.muestrasUsers = new LinkedList<>();



    }
    public static Covid19ManagerImple getInstance()  /*Singletone, puerta de entrada a la instancia*/
    {
        if (manager==null) manager = new Covid19ManagerImple();
        return manager;


    }
    public static void delete(){
        manager = null;    //Permite reiniciar la base de datos
        logger.info("Instancia MathManagerImpl borrada");
    }


    @Override
    public User addUser(String IdUser, String name, String surname, int edad, String valoracion) {
        return null;
    }

    public User addUser(String idUser) {
        User nuevoUsuario = new User(idUser); /* Creo un usuario */
        this.usuarios.put(idUser, nuevoUsuario); /* Lo añado al Hashmap con un identificador*/
        logger.info("se han añadido muestra al usuario con id:"+idUser);
        return nuevoUsuario;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int sizeUsers() {
        int ret = this.usuarios.size();
        logger.info("size user" + ret);

        return ret;
    }

    @Override
    public int sizeMuestras() {
        int ret = this.muestras.size();
        logger.info("size muestras" + ret);

        return ret;
    }

    public Muestra afegirMuestra(String name, String surname, String idMuestra, Date fechaMuestra, String clasificacion, String comentario, String idUser) {
        Muestra nuevo = new Muestra (name, surname, idMuestra, fechaMuestra, clasificacion,comentario, idUser);
        this.muestras.add(nuevo);
        this.usuarios.get(idUser).setMuestrasList(muestras);
        logger.info("se han añadido la muestra al usuario con id:"+idUser);
        return nuevo;


    }


    public List<Muestra> muestraUser(String idUser) {
        return null;
    }


    public Lab addLab(Lab t) {
        logger.info("new Lab " + t);

        this.labs.add (t);
        logger.info("new Track added");
        return t;
    }


    public Lab addLab(String name) {
        return this.addLab(new Lab(name));
    }

    public Lab getLab(String id) {
        logger.info("getTrack("+id+")");

        for (Lab t: this.labs) {
            if (t.getId().equals(id)) {
                logger.info("getLab("+id+"): "+t);

                return t;
            }
        }

        logger.warn("not found " + id);
        return null;
    }

    public List<Lab> findAll() {
        return this.labs;
    }


    public void deleteLab(String id) {

        Lab t = this.getLab(id);
        if (t==null) {
            logger.warn("not found " + t);
        }
        else logger.info(t+" deleted ");

        this.labs.remove(t);

    }


    public Lab updateLab(Lab p) {
        Lab t = this.getLab(p.getId());

        if (t!=null) {
            logger.info(p+" rebut!!!! ");

            t.setName(p.getName());

            logger.info(t+" updated ");
        }
        else {
            logger.warn("not found "+p);
        }

        return t;
    }

}
