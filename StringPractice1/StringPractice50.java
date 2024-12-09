public class StringPractice50 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hiieo";
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch2.length; j++) {
                if(ch1[i] == ch2[j]){
                    System.out.print(ch1[i]+" ");
                }
            }
        }
    }
}
// Write a Java program to find the common characters between two strings.