import java.util.Scanner;
public class For_Practice12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int multi = n1*n2;
        for (int i=1; i<=100; i++) {
            if(i%multi==0){
                System.out.print(i+" ");
            }
        }
    }
}
/* 1-->100 those type of numbers print (divisible by the multiple of any 
two numbers from user input )*/