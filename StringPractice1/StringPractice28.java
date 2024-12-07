import java.util.Scanner;

public class StringPractice28 {
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
        char vowel[] = new char[ch1.length];
        char consonant[] = new char[ch1.length];
        for (int i = 0; i < ch1.length; i++) {
            if(ch1[i]=='a' || ch1[i]=='e' || ch1[i]=='i' || ch1[i]=='o' || ch1[i]=='o'){
                vowel[i] = ch1[i];
            }
            else{
                consonant[i] = ch1[i];
            }
        }
        System.out.println("vowel");
        for (int i = 0; i < vowel.length; i++) {
            System.out.print(vowel[i]+" ");
        }
        System.out.println("\nConsonant");
        for (int i = 0; i < consonant.length; i++) {
            System.out.print(consonant[i]+" ");
        }
    }
}
// 4)String vowel is present or not ?
// how many vowel present (counting)
// which is consonant and vowel 

// regex is my learning platform :present