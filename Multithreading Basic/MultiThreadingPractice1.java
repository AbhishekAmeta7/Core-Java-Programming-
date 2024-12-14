class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
class B extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
            if(i%2 != 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
public class MultiThreadingPractice1 {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        try {
            a.join();
        } catch (Exception e) {}
        B b = new B();
        b.start();
    }
}
// 1).Write a Java program to create two threads. 
// One thread should print odd numbers from 1 to 10, 
// and the other thread should print even numbers from 2 to 10. 
// Ensure proper synchronization to alternate between the two threads.