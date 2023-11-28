package Experiment5;

import java.util.Scanner;

public class Person {
    String name;
    int age;
    char gender;
    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;  
    }
    Person() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.next();
        System.out.print("Enter age: ");
        this.age = sc.nextInt();
        System.out.print("Enter Gender: ");
        this.gender = sc.next().charAt(0);
        sc.close();
    }
}
