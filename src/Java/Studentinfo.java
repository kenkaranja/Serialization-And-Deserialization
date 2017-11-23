package Java;

import java.io.Serializable;

public class Studentinfo implements Serializable {

    String name;
    int id;
    String contact;

    public Studentinfo(String name, int id, String contact) {
        this.name = name;
        this.id = id;
        this.contact = contact;
    }
}
