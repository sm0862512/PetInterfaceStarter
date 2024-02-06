package edu.otc;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Ralph");
        animal.speak("bark");

        Dog dog = new Dog("Fido");
        dog.speak("wooof");

        RobotDog robotDog = new RobotDog();
        robotDog.learn();

        System.out.println(robotDog.intellience);
        robotDog.learn();
        System.out.println(robotDog.intellience);



    }
}