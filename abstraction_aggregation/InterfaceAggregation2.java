public class InterfaceAggregation2 {
    public static void main(String[] args) {
        A a1 = new InterfaceEx2();
        a1.display1();
        B b = new InterfaceEx2();
        b.display2();
        C c = new InterfaceEx2();
        System.out.println("display method inside interface C "+c.display3(90));
        D d = new InterfaceEx2();
        d.display4(88);
    }
}