class A  {
    public synchronized void wish(int n){
        for(int i = 1; i <= n; i++){
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
class B extends Thread {
    A a;
    B(A a){
        this.a = a;
    }
    public void run(){
        a.wish(5);
    }
}
public class MultiThreadingPractice2 {
    public static void main(String[] args) {
        A a = new A();
        B b1 = new B(a);
        B b2 = new B(a);
        b1.start();
        b2.start();
    }
}
// 2).Write a Java program that demonstrates the use of the synchronized 
// keyword to achieve thread safety.Create a class with a shared resource and two 
// threads trying to access and modify that resource. 
// Use synchronization to avoid conflicts.