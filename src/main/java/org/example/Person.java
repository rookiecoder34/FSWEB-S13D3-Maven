package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    private String gender;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, double height,
                  double weight, String gender) {
        this(firstName, lastName, age);
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        boolean teen;

        if (age >= 13 && age<=19) {
            teen = true;
        }else {
            teen = false;
        }
        return teen;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public String getGender() {
        return gender;
    }

}
