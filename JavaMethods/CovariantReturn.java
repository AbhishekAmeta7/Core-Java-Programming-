class A{
    A show(){
        System.out.println("A class show() Method");
        return this;//this----->new A()
    }
}
class B extends A{
    @Override
    B show(){
        super.show();
        System.out.println("B class show() Method");
        return this;//this----->new B()
    }
}
public class CovariantReturn{
    public static void main(String[] args) {
        B a = new B();
    }
}
