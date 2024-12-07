public class StringPractice22 {
    public static void main(String[] args) {
        String s = "character convert upper case";
        char[] ch = s.toCharArray();
        char[] ch1 = new char[ch.length];
        for(int i = 0; i < ch.length; i++){
            ch1[i] = (char)(((int)(ch[i]))-32);
        }
        for (int i = 0; i < ch1.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
// string :
// java is learning platform :

// index :character convert upper case 