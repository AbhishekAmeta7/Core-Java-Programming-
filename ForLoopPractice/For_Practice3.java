import java.util.Scanner;
public class For_Practice3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int fact = 1; 
        for (int i = n; i>=1; i--) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
//5)1--->100 number print 