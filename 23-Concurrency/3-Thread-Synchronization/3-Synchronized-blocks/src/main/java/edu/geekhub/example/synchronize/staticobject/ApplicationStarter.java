package edu.geekhub.example.synchronize.staticobject;

public class ApplicationStarter {

    public static void main(String[] args) {
        Runnable incrementValueRunnable = () -> {
            for (int i = 0; i < 10000; i++) {
                SynchronizedCountObject.increment();
            }
        };

        Runnable printValueRunnable = () -> {
            for (int i = 0; i < 10000; i++) {
                int value = SynchronizedCountObject.getValue();
                System.out.println(value);
            }
        };

        Thread incrementValueThread = new Thread(incrementValueRunnable, "FirstThreadName");
        Thread printValueThread = new Thread(printValueRunnable, "SecondThreadName");

        incrementValueThread.start();
        printValueThread.start();
    }
}
