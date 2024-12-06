interface A1{
    void show1();
    interface A2{
        int show2(int a);
        interface A3{
            int show3();
            interface A4{
                int show4(int a);
            }
        }
    }
}
interface B1{
    void show5();
    interface B2{
        int show6(int a);
        interface B3{
            int show7();
            interface B4{
                int show8(int a);
            }
        }
    }
}
interface C1{
    void show9();
    interface C2{
        int show10(int a);
        interface C3{
            int show11();
            interface C4{
                int show12(int a);
            }
        }
    }
}
interface D1{
    void show13();
    interface D2{
        int show14(int a);
        interface D3{
            int show15();
            interface D4{
                int show16(int a);
            }
        }
    }
}
public class NestedInterfaceAccess3 implements A1.A2.A3.A4,B1.B2.B3.B4,C1.C2.C3.C4,D1.D2.D3.D4{
    public void show1(){
        System.out.println("show1 in interface A1");
    }
    public void show2(int a){
        System.out.println("show2 in interface A2 "+a);
    }
    public int show3(){
        System.out.println("show3 in interface A4");
        return 0;
    }
    public int show4(int a){
        return a;
    }

    public void show5(){
        System.out.println("show5 in interface B1");
    }
    public void show6(int a){
        System.out.println("show2 in interface B2 "+a);
    }
    public int show7(){
        System.out.println("show3 in interface B3");
        return 0;
    }
    public int show8(int a){
        return a;
    }

    public void show9(){
        System.out.println("show9 in interface C1");
    }
    public void show10(int a){
        System.out.println("show10 in interface C2 "+a);
    }
    public int show11(){
        System.out.println("show11 in interface C3");
        return 0;
    }
    public int show12(int a){
        return a;
    }

    public void show13(){
        System.out.println("show13 in interface D1");
    }
    public void show14(int a){
        System.out.println("show14 in interface D2 "+a);
    }
    public int show15(){
        System.out.println("show15 in interface D3");
        return 0;
    }
    public int show16(int a){
        return a;
    }
}