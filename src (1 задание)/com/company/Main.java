package com.company;

public class Main {

    public static void main(String[] args) {
        Animal predator = new Animal("Joy");
        predator.display();
        System.out.println(" ");
        Animal tiger = new Predator("Sherhan", "Индиа");
        tiger.display();
        System.out.println(" ");
        Animal tigerAsian = new Tiger("Sherhan", "Индиа", 2);
        tigerAsian.display();
    }
}


class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void display() {
        System.out.printf("Animal %s", name);
    }
}

class Predator extends Animal {

    public Predator(String name, String habitat) {
        super(name);
        this.habitat = habitat;
    }


    private String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void display() {
        System.out.printf("Predator %s habitat in %s", super.getName(), habitat);
    }
}

class Tiger extends Predator {

    public Tiger(String name, String habitat, Integer age) {
        super(name, habitat);
        this.age = age;
    }

    private Integer age;

    public Integer getAge() {
        if (age != null) {
            return age;
        } else {
            return 0;
        }

    }

    public void setAge(Integer age) {
        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }

    private String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void display() {
        System.out.printf("Tiger %s habitat in %s and age %s", super.getName(), super.getHabitat(), getAge());
    }
}

