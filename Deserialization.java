
import java.io.*;

class Student {
    public int id;
    public String name;
}


class Deserialization1 implements Serializable{
     int id;
     String name;
     public Deserialization1(int id,String name)
     {
        this.id = id;
        this.name = name;
     }
}
public class Deserialization{
    public static void main(String[] args) {
        try
        {
            FileInputStream fis = new FileInputStream("file.txt");
            ObjectInputStream in = new ObjectInputStream(fis);
            Student s = (Student)in.readObject();
            System.out.println(s.id + " " + s.name);
            in.close();
        } catch(Exception e)
        {
            System.out.println("hello");
        }
    }
}