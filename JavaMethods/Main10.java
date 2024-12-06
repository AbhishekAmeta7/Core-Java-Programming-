import java.util.Scanner;
public class Main10{
    boolean neon(int num){
         int ans = 0;
         int sq = num*num;
         while(sq>0) {
             int a = sq%10;
             ans = ans+a;
             sq/=10;
         }
         if(ans == num){
             return true;
         }else{
             return false;
         }
     }
     boolean prime(int num){
         int a=2,count=0;
         while(num>a){
             if(num%a==0){
                 count++;
                 break;
             }
             a++;
         }
         if(count==0){
             return true;
         }else{
             return true;
         }
     }
     boolean perfect(int num){
         int a = 1,ans=0;
         while(num>a){
             if(num%a==0){
                 ans = ans+a;
             }
             a++;
         }
         if(ans==num){
            return true;
         }else{
             return false;
         }
     }
     boolean armstrong(int num){
         int ans=0;
         int temp = num;
         while(num>0){
             int a = num%10;
             ans = ans+a*a*a;
             num/=10;
         }
         if(ans == temp){
             return true;
         }else{
             return false;
         }
     }
     boolean palindrome(int num){
         int ans=0;
         int temp = num;
         while(num>0){
             int a = num%10;
             ans = ans*10+a;
             num/=10;
         }
         if(temp==ans){
             return true;
         }else{
             return false;
         }
     }
     int factorial(int num){
         int fact=1;
         for(int i=num;i>=1;i--){
             fact = fact*i;
         }
         return fact;
     }
     int fibonacci(int num){
         int a=0,b=1;
         System.out.print(a+" "+b+" ");
         for(int i = 1;i<=num;i++){
             int c = a+b;
             System.out.print(c+" ");
             a=b;
             b=c;
         }
         return 0;
}
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String name = sc.next();
        Main10 m = new Main10();
        if(name.equals("neon")){
            int num = sc.nextInt();
            System.out.println("neon number: "+m.neon(num));
        }
        else if(name.equals("prime")){
            int num = sc.nextInt();
            System.out.println("prime number: "+m.prime(num));
        }
        else if(name.equals("perfect")){
            int num = sc.nextInt();
            System.out.println("perfect number: "+m.perfect(num));
        }
        else if(name.equals("armstrong")){
            int num = sc.nextInt();
            System.out.println("armstrong number: "+m.armstrong(num));
        }
        else if(name.equals("palindrome")){
            int num = sc.nextInt();
            System.out.println("palindrome number: "+m.palindrome(num));
        }
        else if(name.equals("factorial")){
            int num = sc.nextInt();
            System.out.println("factorial is: "+m.factorial(num));
        }
        else if(name.equals("fibonacci")){
            int num = sc.nextInt();
            m.fibonacci(num);
        }
        else
           System.out.println("Invalid Choice");               
     }
}
/*class Main 

neon()
prime()
perfect()
Armstrong()
palindrome()
factorial()
Fibonacci()

access method 
enter string 

neon :neon method call  */