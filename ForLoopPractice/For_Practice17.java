import java.util.Scanner;
public class For_Practice17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--:Choice:--\nneon\nperfect\nprime\ncount\nsumofdigit\nfibonacci\n");
        System.out.print("Enter Your Choice: ");
        String ch = sc.next();
        int ans = 0;
        if(ch.equals("neon")){
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            int sq = num*num;
            while(sq>0){
                int a = sq%10;
                ans = ans+a;
                sq = sq/10;
            }
            if(num == ans){
                System.out.println(num+" is Neon Number");
            }else{
                System.out.println(num+" is not Neon Number");
            }
        }
        else if(ch.equals("perfect")){
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            int i = 1;
            while(i<num){
            if(num%i == 0){
                ans = ans + i;
                
            }
            i++;
        }
        if(num == ans){
            System.out.println(num+" is perfect number");
        }
        else{
            System.out.println(num+" is not perfect number");
        }
        }
        else if(ch.equals("prime")){
            System.out.println("checkprime\nprintprime");
            System.out.print("Enter Choice: ");
            String ch1 = sc.next();
            if(ch1.equals("checkprime")){
                System.out.print("Enter Number: ");
            int num = sc.nextInt();
            int n = 2,count=0;
            while(num>n){
                if(num%n==0){
                    count++;
                    break;
                }
                n++;
            }
            if(count==0){
                System.out.println(num+" is Prime Number");
            }else{
                System.out.println(num+" is not Prime Number");
            }
            }
            else if(ch1.equals("printprime")){
                System.out.print("Enter Number: ");
        int a = sc.nextInt();
        for (int i = 2; i <=a; i++) {
                int n = 2,count = 0;
                while(i>n){
                    if(i%n==0){
                    count++;
                    break;
                    }
                    n++;
                   }
                   if(count == 0){
                       System.out.print(i+" ");
                }
            }
            }
            else{
                System.out.println("!--Invalid Choice--!");
            }
        }
        else if(ch.equals("sumofdigit")){
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            while(num>0){
                int a = num%10;
                ans = ans+a;
                num = num/10;
            }
            System.out.println("Sum Of Didit: "+ans);
        }
        else if(ch.equals("count")){
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            int count=0;
            while(num>0){
                num=num/10;
                count++;
            }
            System.out.println("Count Of digit: "+count);
        }
        else if(ch.equals("sumofdigit")){
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            int a=0;
            while(num>0){
                a=num%10;
                ans = ans+a;
                num=num/10;
            }
            System.out.println("Count Of digit: "+ans);
        }
        else if(ch.equals("fibonacci")){
            System.out.println("series , sumoffibonacci");
            System.out.print("Enter Choice: ");
            String ch1 = sc.next();
            if(ch1.equals("series")){
                System.out.print("enter nth term: ");
                int num = sc.nextInt();
                int a = 0,b=1;
                System.out.print(a+" "+b+" ");
                for(int i = 1;i<=num;i++){
                    int c = a+b;
    
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                }
            }
                else if(ch1.equals("sumoffibonacci")){
                    System.out.print("enter nth term: ");
                    int num = sc.nextInt();
                    int a = 0,b=1;
                    int x = a+b;
                    int y = 0;
                    for(int i = 0;i<num;i++){
                        int c = a+b;
                       y = y+c;
                        a=b;
                        b=c;
                    }
                    y = y+x;
                   System.out.println(y+" ");
                }
                else{
                    System.out.println("!--Invalid Choice--!");
                }
            }
            else{
                System.out.println("<---Invalid Choice--->");
            }
    }
}

