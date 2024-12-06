abstract class Abstraction1 {
    abstract void show();
    abstract void show1(int a);
    abstract int show2();
    abstract String show3(String s);
    abstract Abstraction1  show4();
}
public class ExtendsAbs extends Abstraction1{
    public void show(){
        System.out.println("No Retutn & No argument abstract method");
    }
    public void show1(int a){
        System.out.println("No Retutn & argument abstract method "+a);
    }
    public int show2(){
        System.out.println("Retutn & No argument abstract method");
        return 0;
    }
    public String show3(String s){
        return s;
    }
    Abstraction1 show4(){
        System.out.println("Covariant Return abstract method");
        return this;
    }
}