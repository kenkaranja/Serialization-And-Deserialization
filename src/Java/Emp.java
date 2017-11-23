package Java;

import java.io.Serializable;

public class Emp implements Serializable {
    String name;
    int age;
    transient int a;
    static int b;
    String address;

    public Emp(String name, int age, int a, int b, String address) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
        this.address = address;
    }
}
