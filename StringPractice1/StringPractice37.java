public class StringPractice37 {
    public static void main(String[] args) {
        String s = "java is a platform independent language";
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='o'){
                count++;
            }
        }
        System.out.println("Consonant Count: "+count);
    }
}
// java is a platform independent language. 

//  consoant :how much 