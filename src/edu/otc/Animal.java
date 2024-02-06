package edu.otc;
/**
 * Class that represents an animal with a given name & the ability to make sound.
 * This class provides a basic structure for modeling various types of    animals.
 */


public class Animal {
    public String name;

    /**
     * A Constructor that initializes a new instance of the Animal class with the specified name.
     * Params:name - The name of the animal, used to identify it within the simulation.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Simulates the sound made by the animal.
     * This method prints out the animal's sound to standard output, mimicking the animal's speech.
     * Params: sound - The sound that the animal is capable of making, represented as a string.
     */

    public void speak (String sound){
        System.out.printf("%s %s\n", sound, sound);
    }


}
