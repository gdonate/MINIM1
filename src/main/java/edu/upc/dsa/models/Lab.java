package edu.upc.dsa.models;
import edu.upc.dsa.util.RandomUtils;
public class Lab {

    String id;
    String name;

    public Lab() {
        this.id = RandomUtils.getId();
    }

    public Lab(String name) {
        this();
        this.setName(name);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
