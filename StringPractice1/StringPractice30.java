import java.util.Scanner;

public class StringPractice30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        for (int i = ch.length-1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
// 6).String is print reverse