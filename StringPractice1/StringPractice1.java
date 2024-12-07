public class StringPractice1 {
    public static void main(String[] args){
        String s = "Hello How Are You";
        String[] s1 = s.split(" ");
        for (String s2 : s1) {
            System.out.print(s2+" ");
        }
    }
}