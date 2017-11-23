package Java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemonstateserialVersionUID {
    public static void main(String... args) {
        Lion lion = new Lion("roar");
        try {
            //serialize
            System.out.println("Serialization done.");
            FileOutputStream fos = new FileOutputStream("serial.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lion);

            //deserialize
            FileInputStream fis = new FileInputStream("serial.out");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Lion deserializedObj = (Lion) ois.readObject();
            System.out.println("DeSerialization done. Lion: " + deserializedObj.getSound());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
