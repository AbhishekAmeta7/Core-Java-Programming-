import java.util.Scanner;

public class StringPractice14 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        char[] ch = s1.toCharArray();
        char[] ch1 = s2.toCharArray();
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
            System.out.println(s1+" , "+s2+" --> boths are equal");
        }
        else{
            System.out.println(s1+"  "+s2+" boths are Not equal");
        }
    }
}
// String : s1 :hello
// s2 :hello 

// check equal or not 