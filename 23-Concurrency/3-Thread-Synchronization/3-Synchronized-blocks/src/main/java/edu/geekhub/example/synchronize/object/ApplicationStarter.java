package edu.geekhub.example.synchronize.object;

public class ApplicationStarter {

    public static void main(String[] args) {
        SynchronizedCountObject countObject = new SynchronizedCountObject();

        Runnable incrementValueRunnable = () -> {
            for (int i = 0; i < 10000; i++) {
                countObject.increment();
            }
        };

        Runnable printValueRunnable = () -> {
            for (int i = 0; i < 10000; i++) {
                int value = countObject.getValue();
                System.out.println(value);
            }
        };

        Thread incrementValueThread = new Thread(incrementValueRunnable, "FirstThreadName");
        Thread printValueThread = new Thread(printValueRunnable, "SecondThreadName");

        incrementValueThread.start();
        printValueThread.start();
    }
}
