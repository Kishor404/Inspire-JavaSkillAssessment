// Implement a thread in Java that prints the numbers from 1 to 10 with a delay of 1 second between each number. Use the sleep() method to achieve the delay.

public class Q5 extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Q5 t = new Q5();
        t.start();
    }
}