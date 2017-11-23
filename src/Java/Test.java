package Java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String... args) {
        try {
            Studentinfo studentinfo = new Studentinfo("ken", 4, "6789");
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentinfo);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
