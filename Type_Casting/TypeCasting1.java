public class TypeCasting1{
    public static void main(String[] args){
        byte a = 65;
        char ch = (char)a;
        short b = a;
        int c = a;
        long d = a;
        float e = a;
        double f = a;
        System.out.println("Char: "+ch);
        System.out.println("short: "+b);
        System.out.println("int: "+c);
        System.out.println("long: "+d);
        System.out.println("float: "+e);
        System.out.println("double: "+f);
        
    }
}
// byte -> short -> char -> int -> long -> float -> double  

// byte-->short 
// byte-->char
// byte-->int  
// byte-->long
// byte-->float
// byte-->double 