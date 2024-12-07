public class StringPractice2 {
    public static void main(String[] args) {
        String s = "Programming";
        char[] ch = s.toCharArray();
        for(int i = ch.length-1; i >= 0; i--){
            System.out.print(ch[i]+"");
        }
    }
} 