import java.util.Scanner;
class A{
    boolean istrue(boolean b){ 
        return b;
        }
        char show1(char c){ 
            return c;
        }
        byte show2(byte by){
             return by;
        }
        short show3(short s){
            return s;
        }
    int show( int a){
        return a;
    }
    long show4(long l){
        return l;
    }
    float show5( float f){
        return f;
    }
    double showDouble(double d ){
        return d;
    }
}
public class Main9{
    public static void main(String[] args){
        A obj = new A();
        System.out.println("boolean: "+obj.istrue(true));
        System.out.println("char: "+obj.show1('A'));
        System.out.println("byte: "+obj.show2(10));
        System.out.println("short: "+obj.show3(10000));
        System.out.println("int: "+obj.show(2000000000));
        System.out.println("long: "+obj.show4(45438538238l));
        System.out.println("float: "+obj.show5(3.14f));
        System.out.println("double: "+obj.showDouble(6383.5));
    }
}
/*
7): return : int | char | float ...primitive data type as return type 
	String 
*/