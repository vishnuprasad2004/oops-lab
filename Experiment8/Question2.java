package Experiment8;

import java.util.Scanner;

/**
 * WAP to print the roll no and avg marks of 8 students in 3 subjects (each of 100 marks). The marks are entered by user by using array of objects.
 */

class Student {
    int rollno;
    int marks[] = new int[3];
    void setMarks(int m1,int m2,int m3) {
        this.marks[0] = m1;
        this.marks[1] = m2;
        this.marks[2] = m3;
    }
    void setRollno(int rollno) {
        this.rollno = rollno;
    }
    int getAvg() {
        int sum = this.marks[0]+this.marks[1]+this.marks[2];
        System.out.println("The Average is: "+ (sum/3));
        // System.out.println("The Percentage is: "+((sum/300)*100));
        return (sum/3);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student aimlStudents[] = new Student[2];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<aimlStudents.length;i++) {
            System.out.println("~~~~~~~~~~~~~~ NEW STUDENT ~~~~~~~~~~~~~");
            aimlStudents[i] = new Student();
            aimlStudents[i].setRollno(sc.nextInt());
            aimlStudents[i].setMarks(sc.nextInt(),sc.nextInt(),sc.nextInt());
            max = Math.max(max, aimlStudents[i].getAvg());
            System.out.println("~~~~~~~~~~~~~~ DONE SUCESSFULLY ~~~~~~~~~~~~~");
        } 
        System.out.println("Maximum average is: "+ max);
    }    

}
