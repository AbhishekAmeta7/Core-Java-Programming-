import java.util.Scanner;
class A{
    int a;
    void display(int a){
        this.a = a;
        System.out.println("a: "+a);
    }
}
class B extends A{
    int b;
    void display1(int b){
        this.b=b;
        System.out.println("b: "+b);
    }
}
class C extends B{
    int add(){
        return (a+b);
    } 
}

public class MultiLevel_In1{
    public static void main(String[] args){
        C c = new C();
        int x = 20,y=50;
        c.display(x);
        c.display1(y);
        System.out.println(c.add());
    }
}
/*7): multilevel inheritance :
	instance variable : user input through constant name  */