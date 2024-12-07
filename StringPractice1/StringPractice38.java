import java.util.Scanner;

public class StringPractice38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            count++;
        }
        System.out.println("Length Of String: "+count);
    }
}
// Write a Java program to find the length of a given string