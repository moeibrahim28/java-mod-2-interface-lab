package main;

public interface Animal {
    default void breathe() {
        System.out.println("I took a breathe.");
    }
}
