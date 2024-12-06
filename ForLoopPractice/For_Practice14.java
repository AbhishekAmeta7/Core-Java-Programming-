import java.util.Scanner;
public class For_Practice14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--:Choice:--\narmstrong\npalindrome\nreverse");
        System.out.print("Enter Your Choice: ");
        String ch = sc.next();
        int a = 0,result = 0;
        if(ch.equals("armstrong")){
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            int temp = num;
           while(num>0){
            a = num%10;//
            result = result+a*a*a;
            num=num/10;
           }
           if(temp==result)
             System.out.println(temp+" is armstrong number");
           else
             System.out.println(temp+" is not armstrong number");
        }
        else if(ch.equals("palindrome")){
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            int temp = num;
            while(num>0){
                a = num%10;
                result = result*10+a;
                num = num/10;
            }
            if(temp==result)
             System.out.println(temp+" is Palindrome number");
           else
             System.out.println(temp+" is not Palindrome number");
        }
        else if(ch.equals("reverse")){
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            while(num>0){
                a = num%10;
                result = result*10+a;
                num=num/10;
               }
               System.out.println("Reverse Number: "+result);
        }
        else{
            System.out.println("! Invalid Choice !");
        }
    }
}
/*7)write and make a program user input armstrong = then check number is armstrong and not ,
 when user input palindrome =check number is palindrome or not , 
 when user input reverse then check number is reverse or not (through user input ) (use if 
else if else and while loop and for loop only ) */