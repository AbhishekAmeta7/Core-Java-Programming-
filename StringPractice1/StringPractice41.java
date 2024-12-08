public class StringPractice41 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "HELLO";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int count = 0;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch2.length; j++) {
                if(ch1[i] == ch2[j]){
                    count++;
                    break;
                }
            }
        }
        if((count == ch1.length) && (count == ch2.length)) {
            System.out.println("Equals");
        }
        else {
            System.out.println("Not Equals");
        }
    }
}
// Write a Java program to compare two strings while ignoring case.