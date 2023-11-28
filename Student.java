import java.io.*;
class Student1 implements Serializable {
    int id;
    String name;
    public Student1(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
public class Student 
{
        public static void main(String[] args) {
            try
            { 
               Student1 s1 = new Student1(101,"ashu");
               FileOutputStream fout = new FileOutputStream("file.txt");
               ObjectOutputStream out = new ObjectOutputStream(fout);
               out.writeObject(s1);
               out.flush();
               out.close();
               System.out.println("Success");
            } catch(Exception e)
            {
                System.out.println(e);
            }
        }

        public String id;
        public String name;
}