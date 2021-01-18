package com.company;

public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;


    public Pet() {
        this(name, age, location, type;
    }

    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getLocation() {
        return this.location;
    }

    public String getType() {
        return this.type;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setLocation(String newLocation) {
        this.location = newLocation;
    }

    public void setType(String newType) {
        this.type = newType;
    }
}
