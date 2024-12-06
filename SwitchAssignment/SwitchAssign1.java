import java.util.Scanner;
public class SwitchAssign1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choice: ");
        String choice = sc.next();
        switch (choice) {
            case "type1":
                System.out.print("Enter 1-even or 2->odd: ");
                int n = sc.nextInt();
                if(n==1){
                    System.out.print("Enter Number: ");
                    int num = sc.nextInt();
                    if(num%2==0){
                        System.out.println("Even");
                    }
                    else{System.out.println("Odd");}
                }
                else if(n==2){
                    System.out.print("Enter Number: ");
                    int num = sc.nextInt();
                    if(num%2!=0){
                        System.out.println("Odd");
                    }else{System.out.println("Even");}
                }
                else{
                    System.out.println("Invalid Number");
                }
                break;
            case "type2":
                System.out.print("Enter e-even or o->odd: ");
                char ch = sc.next().charAt(0);
                if(ch=='e'){
                    System.out.print("Enter Number: ");
                    int num = sc.nextInt();
                    if(num%2==0){
                        System.out.println("Even");
                    }else{System.out.println("Odd");}
                }
                else if(ch=='o'){
                    System.out.print("Enter Number: ");
                    int num = sc.nextInt();
                    if(num%2!=0){
                        System.out.println("Odd");
                    }else{System.out.println("Even");}
                }
                else{
                    System.out.println("Invalid");
                }
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
/*write a program to check whether the number is even or odd 
type1: 1 even number 
2 :odd number 

type2: e =>even number 
o=>odd number */