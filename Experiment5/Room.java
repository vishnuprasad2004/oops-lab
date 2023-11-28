package Experiment5;

import java.util.Scanner;

/**
 * Define a class called Room with the following attributes 1. length, 2. breadth, 3. height, 4. floor area, 5. Wall area, 6. No.of fans, 7. no of windows, 8. no of doors. Define suitable contructor & a method to display details of a room. Assume that 20% of the total wall area is accepted by doors and windows.
 */
public class Room {
    int length;
    int breadth;
    int height;
    int floorArea;
    int wallArea;
    int fans;
    int windows;
    int doors;
    Room() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length:");
        this.length = sc.nextInt();
        System.out.print("Enter Breadth:");
        this.breadth = sc.nextInt();
        System.out.print("Enter Height:");
        this.height = sc.nextInt();
        System.out.print("Enter Floor Area:");
        this.floorArea = sc.nextInt();
        System.out.print("Enter Wall Area:");
        this.wallArea = sc.nextInt();
        System.out.print("Enter number of fans:");
        this.fans = sc.nextInt();
        System.out.print("Enter number of window(s):");
        this.windows = sc.nextInt();
        System.out.print("Enter number of doors:");
        this.doors = sc.nextInt();
        sc.close();
    }
     
    void displayDetails() {
        System.out.println("Length:" + this.length);
        System.out.println("Breadth:" + this.breadth);
        System.out.println("Height:" + this.height);
        System.out.println("Floor Area:" + this.floorArea);
        System.out.println("Wall Area:" + this.wallArea);
        System.out.println("Number of fans:" + this.fans);
        System.out.println("Number of doors:" + this.doors);
        System.out.println("Number of windows:" + this.windows);
        System.out.println("Area of wall covered by windows and doors" + (0.20f * this.wallArea));
    }
}
