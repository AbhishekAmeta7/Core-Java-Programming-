import java.util.Scanner;
public class For_Practice2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Positive integer: ");
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++){
            int ans = n*i; 
            System.out.println(n+" x "+i+" = "+ans);
        }
    }
}
/*3)Write a program that prompts the user to input a positive integer.
 It should then print the multiplication table of that number. */