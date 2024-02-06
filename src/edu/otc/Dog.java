package edu.otc;

/**
 * The  Dog class represents a type of animal that extends the {@code Animal} class.
 * It provides a constructor to initialize a new instance of the {@code Dog} class with a specified name.
 * This class is used to simulate and manage dogs within the system.
 */


public class Dog extends Animal {
    /**
     * A Constructor that initializes a new instance of the Animal class with the specified name.
     * Params:name - The name of the animal, used to identify it within the simulation.
     *
     * @param name - used for the super Animal param
     */
    public Dog(String name) {
        super(name);
    }


}
