package Experiment7;

import java.util.*;
/*
 * Define a class employee having private members-id,name,department,salary. Define default parameterized
 *  constructors. Create a subclass called "Manager" with private member bonus. Define methods to accept
 *  and display values for both calsses. Create N objects of the manager class and display the details of the
 *  manager having the maximum total salary(salary+bonus).

 */

class Employee {
    private int id;
    private String name;
    private String department;
    private int salary;

    Employee() {
        this.id = 1;
        this.name = "Vishnu";
        this.department = "Somewhere";
        this.salary = 99999999;
    }

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    String getDep() {
        return this.department;
    }

    int getSal() {
        return this.salary;
    }

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setDep(String department) {
        this.department = department;
    }

    void setSal(int salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    private int bonus = 10000;

    Manager() {
        super();
    }
    void display() {
        System.out.println("Managers Info:");
        System.out.println("EMP ID:" + this.getId());
        System.out.println("EMP Name:" + this.getName());
        System.out.println("EMP Department:" + this.getDep());
        System.out.println("EMP Salary(With bonus):" + (this.getSal() + this.bonus));
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager arr[] = new Manager[3];
        for (Manager manager : arr) {
            System.out.print("Enter ID:");
            manager.setId(sc.nextInt());
            System.out.print("Enter Name:");
            manager.setName(sc.next());
            System.out.print("Enter Department:");
            manager.setDep(sc.next());
            System.out.print("Enter Salary:");
            manager.setSal(sc.nextInt());
        }
        Manager bestManager = arr[0];
        for (Manager manager : arr) {
            if (bestManager.getSal() < manager.getSal()) {
                bestManager = manager;
            }
        }
        bestManager.display();

    }
}