package test;
public class assignq20 implements Runnable {

    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {

        assignq20 obj = new assignq20(); // object
        Thread t = new Thread(obj);      // thread create
        t.start();                       // start thread
    }
}