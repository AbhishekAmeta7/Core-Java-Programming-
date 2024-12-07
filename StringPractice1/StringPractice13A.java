import java.util.*;
public class StringPractice13A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String s = sc.next();
        char[] ch = s.toCharArray();
        char[] ch1 = new char[ch.length];
        for(int i = 0; i < ch.length; i++){
            ch1[i] = ch[ch.length-1-i];
        } 
        int count = 0;
        for(int i = 0; i < ch.length; i++){
            for(int j = i ; j <= i; j++){
                if(ch[i]==ch1[i]){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        if(count == ch.length){
            System.out.println(s+" is Palindrome");
        }
        else{
            System.out.println(s+" is Not Palindrome");
        }
    }
}