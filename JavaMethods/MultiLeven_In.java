class A{
    private int a;
    private int b;
    public void setA(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public void add()
    {
        System.out.println("Add: "+(a+b));
    }
}
class B extends A{
    private int x;
    private int y;
    public void setX(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void multi()
    {
        System.out.println("Multi: "+(x*y));
    }
}
class C extends B{
    private int p;
    private int q;
    public void setP(int p,int q){
        this.p=p;
        this.q=q;
    }
    public int getP(){
        return p;
    }
    public int getQ(){
        return q;
    }
    public void sub()
    {
        System.out.println("sub: "+(p-q));
    }
}
public class MultiLeven_In {
    public static void main(String[] args){
        C obj = new C();
        obj.setA(40,50);
        obj.getA();
        obj.getB();
        obj.add();
        obj.setX(20, 10);
        obj.getX();
        obj.getY();
        obj.multi();
        obj.setP(77, 7);
        obj.getA();
        obj.getQ();
        obj.sub();
        
        
        
    }
}
/*
class A
add

class B
multi

class C 
substraction 

class Main :access

getter and setter 

*/