public class AggregationAbstraction1 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.show();
        B1 b1= new B1();
        b1.show1(80);
        C1 c1 = new C1();
        c1.show2(); 
        D1 d1 = new D1();
        System.out.println(d1.show3("Java Aggregation......"));
        E1 e1 = new E1();
        e1.show4();
    }
}