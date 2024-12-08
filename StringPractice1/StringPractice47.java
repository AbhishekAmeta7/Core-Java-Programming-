public class StringPractice47 {
    public static void main(String[] args) {
        String s = "java is platform independent language";
        String[] s1 = s.split(" ");
        String[] s2 = new String[s1.length];
        for (int i = 0; i < s1.length; i++) {
            s1[i] = s1[i].substring(0, 1).toUpperCase() + s1[i].substring(1).toLowerCase();
            s2[i] = s1[i];
        }
        for (String string : s2) {
            System.out.print(string+" ");
        }
    }
}
// substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
// Write a Java program to capitalize the first letter of each word in a string.