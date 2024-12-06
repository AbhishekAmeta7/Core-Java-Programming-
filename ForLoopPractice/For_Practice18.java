import java.util.Scanner;
public class For_Practice18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nth term: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.print("Enter Car Number: ");
            int num = sc.nextInt();
            int ans = 0;
            int temp = num,count =0;
            while(num>0){
                int a = num%10;
                ans = ans+a;
                num/=10;
                count++;
            }
            
            if(ans%3==0 || ans%5==0 || ans%7==0){
                if(count==4){
                    System.out.println("Sample Output: "+i);
                    System.out.println("Lucky Number");
                }else{
                    System.out.println("Sample Output: "+i);
                    System.out.println("Sorry its not my lucky number");   
                }
            }
            else{
                System.out.println("Sample Output: "+i);
                System.out.println("Sorry its not my lucky number");   
            }
        }
    }
}
