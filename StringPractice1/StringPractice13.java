public class StringPractice13 {
    public static void main(String[] args) {
        String s = "abcba";
        char[] ch = s.toCharArray();
        char[] ch1 = new char[ch.length];
        for(int i = 0; i < ch.length; i++){
            ch1[i] = ch[ch.length-1-i];
        } 
        String s1 = String.valueOf(ch);
        String s2 = String.valueOf(ch1);
        if(s1.equals(s2)){
            System.out.println(s+" is Palindrome");
        }
        else{
            System.out.println(s+" is Not Palindrome");
        }
    }
}