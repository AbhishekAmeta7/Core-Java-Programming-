import java.util.*;
public class StringAnagram2 {
    public static boolean isAnagram(String s1 , String s2){
        char[] ch1 = s1.toLowerCase().toCharArray();
        char[] ch2 = s2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean b = Arrays.equals(ch1, ch2);
        return b;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String s2 = sc.nextLine();
        s1 = s1.replace(" ","");
        s2 = s2.replace(" ", "");
        boolean b = isAnagram(s1 , s2);
        if(b == true){
            System.out.println("String Is Anagram");
        }
        else{
            System.out.println("String Is Not Anagram");
        }
    }
}
