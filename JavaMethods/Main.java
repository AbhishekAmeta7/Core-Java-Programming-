import java.util.Scanner;
class A{
    private int a;
    public void setA(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
}
class B extends A{
    private int b;
    public void setB(int b){
        this.b=b;
    }
    public int getB(){
        return b;
    }
}
public class Main{
    public static void main(String[] args) {
       B obj = new B();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a: ");
       int a = sc.nextInt();
       obj.setA(a);
       System.out.print("Enter b: ");
       int b = sc.nextInt();
       obj.setB(b);
       System.out.println("Class A \n"+obj.getA());
       System.out.println("Class B \n"+obj.getB());
    }
}
/*class A
getter setter

class B ex A
getter setter

class Main :access*/
