public class StringPractice29 {
    public static void main(String[] args) {
        String s = "java is a platform independent language";
        char[] ch = s.toCharArray();
        char c = 'i';
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==c){
                System.out.print(i+" ");
            }
        }
    }
}
// 5).want to find index :user 
// i =>indexing 