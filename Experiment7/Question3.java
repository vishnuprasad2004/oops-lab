package Experiment7;
/*
 * Create a class Animal with a method  Show(). Inherit the animal class to man,dog,elephant,rabbit. Inherit classes must have string member name and atleast 2 constructor. Implements the method over riding show().
 */

class Animal  {
    String name;
    Animal () {
        this.name = "Something";
    }
    void show() {
        System.out.println("Name:" + this.name);
    }
}
class Man extends Animal {
    Man() {
        this.name = "Human";
    }
    Man(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog() {
        this.name = "Dog";
    }
    Dog(String name) {
        this.name = name;
    }
}


class Elephant extends Animal {
    Elephant() {
        this.name = "Elephant";
    }
    Elephant(String name) {
        this.name = name;
    }
}

class Rabbit extends Animal {
    Rabbit() {
        this.name = "Rabbit";
    }
    Rabbit(String name) {
        this.name = name;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Man person = new Man();
        person.show();
    }
}
