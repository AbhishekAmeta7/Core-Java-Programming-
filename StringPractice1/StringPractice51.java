public class StringPractice51 {
    public static void main(String[] args) {
        String s = "Java Is OOP Language";
        String[] s1 = s.split(" ");
        for (int i = s1.length-1; i >= 0; i--) {
            System.out.print(s1[i]+" ");
        }
    }
}
// Write a Java program to reverse the order of words in a sentence.