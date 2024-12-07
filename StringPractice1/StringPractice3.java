public class StringPractice3 {
    public static void main(String[] args) {
        String s = "Programming";
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++){
            System.out.print(ch[i]);
        }
        System.out.println();
        for(int i = 0; i < ch.length; i++){
            System.out.print(i);
        }
    }
}
// string index print with single character 