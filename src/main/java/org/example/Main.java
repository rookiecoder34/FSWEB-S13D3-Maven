package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person("TOLGA","AYAYDIN",15);
        Person person = new Person("John", "Doe", 20);
        System.out.println(person1.isTeen());
        Wall wall = new Wall(5,4);
        System.out.println(wall.getArea());
        System.out.println(wall.setHeight(-1.5));
        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}
