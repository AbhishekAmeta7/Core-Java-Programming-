public class StringPractice20 {
    public static void main(String[] args) {
        String s = "java is a learning platform";
        char[] ch = s.toCharArray();
        int[] ch1 = new int[ch.length];
        for(int i = 0; i < ch.length; i++){
            ch1[i] = (int)ch[i];
        }
        int[] ch2 = new int[ch1.length];
        for (int i = 0; i < ch1.length; i++) {
            ch2[i] = ch1[i]-32;
        }
        for(int i = 0; i < ch1.length; i++){
            ch[i] = (char) (ch2[i]);
        }
        for(int i = 0; i < ch.length; i++){
            System.out.print(ch[i]+" ");
        }
    }
}
// String :
// java is a learning platform 

// character upper case convert 