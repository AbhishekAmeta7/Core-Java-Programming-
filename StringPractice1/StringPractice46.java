public class StringPractice46 {
    public static void main(String[] args) {
        String s = "Java is Platform Independent Language";
        String[] s1 = s.split(" ");
        String s2 = "";
        for (int i = 0; i < s1.length; i++) {
            for (int j = i+1; j < s1.length; j++) {
                int x = s1[i].length();
                int y = s1[j].length();
                if(x>y){
                    s2 = s1[i];
                    System.out.println(s1[i].length());
                    System.out.println(s1[j].length());
                }
            }
            
        }
        System.out.println(s2); 
    }
}
// Write a Java program to find the longest word in a string.