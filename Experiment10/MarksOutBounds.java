package Experiment10;

public class MarksOutBounds {
    int marks[] = {100,24,99,98};

    public int get(int i) throws Exception {
        if(i >= 5) {
            throw new Exception("Marks out of Bounds Exception");
        }
        return this.marks[i];
    } 
    public static void main(String[] args) {
        MarksOutBounds o =new MarksOutBounds();
        try {
            o.get(100);
            System.out.println("Try Block");
        }catch(Exception e) {
            System.out.println(e);
            System.out.println("Exception occured");
        }finally {
            System.out.println("Finally");
            
        }
    }
}
