import java.util.Scanner;

public class StringPractice27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Charcter: ");
        char ch = sc.next().charAt(0);
        String s = "regex is my learning platform";
        char[] ch1 = s.toCharArray();
        int count = 0;
        for(int i = 0; i < ch1.length; i++){
            if(ch==ch1[i]){
                count++;
            }
        }
        if(count>0){
            System.err.println("Yes "+ch+" is present "+count+" time");
        }
        else{
            System.out.println(ch+" is Not Present in The String");
        }
    }
}
// 3)String : 
// input a character check characher present or not ? 
// how many time present ? 