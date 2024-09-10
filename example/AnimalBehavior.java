package org.example;

public interface AnimalBehavior {

    void eat();

    void sleep();

    void makeSound();

    public abstract class Animal implements AnimalBehavior {

        protected String name;
        protected int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public abstract void displayInformation();

        public void eat() {
            System.out.println(this.name + " is eating.");
        }

        public void sleep() {
            System.out.println(this.name + " is sleeping.");
        }

        public void makeSound() {
            System.out.println(this.name + " is making a sound.");
        }
    }

    public abstract class Mammal extends Animal {
        public Mammal(String name, int age) {
            super(name, age);
        }

        public void eat() {
            System.out.println(this.name + " the mammal is eating.");
        }

        public void makeSound() {
            System.out.println(this.name + " the mammal is making a sound.");
        }
    }

    public abstract class Bird extends Animal {

        public Bird(String name, int age) {
            super(name, age);
        }

        public void eat() {
            System.out.println(this.name + " the bird is eating.");
        }

        public void makeSound() {
            System.out.println(this.name + " the bird is making a sound.");
        }
    }

    public class Eagle extends Bird {

        public Eagle(String name, int age) {
            super(name, age);
        }

        public void makeSound() {
            System.out.println(this.name + " the eagle screeches.");
        }

        public void displayInformation() {
            System.out.println("This is an eagle named " + this.name + ", aged " + this.age + ".");
        }
    }

    public class Elephant extends Mammal {

        public Elephant(String name, int age) {
            super(name, age);
        }

        public void makeSound() {
            System.out.println(this.name + " the elephant trumpets.");
        }

        public void displayInformation() {
            System.out.println("This is an elephant named " + this.name + ", aged " + this.age + ".");
        }
    }

    public class Lion extends Mammal {

        public Lion(String name, int age) {
            super(name, age);
        }

        public void makeSound() {
            System.out.println(this.name + " the lion roars.");
        }

        public void displayInformation() {
            System.out.println("This is a lion named " + this.name + ", aged " + this.age + ".");
        }
    }

    public class Parrot extends Bird {

        public Parrot(String name, int age) {
            super(name, age);
        }

        public void makeSound() {
            System.out.println(this.name + " the parrot squawks.");
        }

        public void displayInformation() {
            System.out.println("This is a parrot named " + this.name + ", aged " + this.age + ".");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal lion = new Lion("Leo", 5);
            Animal elephant = new Elephant("Ella", 10);
            Animal parrot = new Parrot("Polly", 2);
            Animal eagle = new Eagle("Eddie", 4);

            lion.eat();
            lion.makeSound();
            lion.displayInformation();

            elephant.eat();
            elephant.makeSound();
            elephant.displayInformation();

            parrot.eat();
            parrot.makeSound();
            parrot.displayInformation();

            eagle.eat();
            eagle.makeSound();
            eagle.displayInformation();
        }
    }
}

