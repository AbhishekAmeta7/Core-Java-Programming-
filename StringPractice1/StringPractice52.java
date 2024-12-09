import java.util.Scanner;

public class StringPractice52 {
    public static void main(String[] args) {
        String s = "java is secure programming language";
        char[] ch = s.toCharArray();
        char[] ch1 = new char[ch.length];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char c = sc.next().charAt(0);
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==c){
                ch[i]=0;
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] != 0){
                System.out.print(ch[i]);
            }
        }
    }
}
// Write a Java program to remove all occurrences of a specific character from a string.