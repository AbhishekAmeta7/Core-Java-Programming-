class A{
    boolean istrue(){
        boolean b = true;
        return b;
        }
        char show1(){
            char c = 'H';
            return c;
        }
        byte show2(){
            byte by = 10;
             return by;
        }
        short show3(){
            short s = 10000;
            return s;
        }
    int show(){
        int a = 2000000000;
        return a;
    }
    long show4(){
        long l = 10020304495004l;
        return l;
    }
    float show5(){
        float f = 45.8f;
        return f;
    }
    double showDouble(){
        double d = 678866.8;
        return d;
    }
}
public class Main8{
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("boolean: "+obj.istrue());
        System.out.println("char: "+obj.show1());
        System.out.println("byte: "+obj.show2());
        System.out.println("short: "+obj.show3());
        System.out.println("int: "+obj.show());
        System.out.println("long: "+obj.show4());
        System.out.println("float: "+obj.show5());
        System.out.println("double: "+obj.showDouble());
    }
}
/*return and no argument 
return : int | char | float ...primitive data type as return type 
	String */