package edu.geekhub.example.synchronize.staticobject;

public class SynchronizedCountObject {

    private static int value = 0;

    public static synchronized int getValue() {
        return value;
    }

    public static synchronized void increment() {
        value++;
    }
}
