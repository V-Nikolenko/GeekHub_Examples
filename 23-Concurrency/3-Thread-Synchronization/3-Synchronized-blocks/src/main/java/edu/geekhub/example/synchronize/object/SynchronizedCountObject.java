package edu.geekhub.example.synchronize.object;

public class SynchronizedCountObject {

    private int value = 0;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void increment() {
        this.value++;
    }
}
