public class StringPractice6 {
    public static void main(String[] args) {
        String s = "java is learning platform";
        char[] ch = s.toCharArray();
        int c1 = 0, c2 = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i]!='a'&&ch[i]!='e'&& ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u'){
                c2++;
            }
            else{
                c1++;
            }
        }
        if(c1>c2){
            System.out.println("Vowel is Max");
        }
        else{
            System.out.println("Consonant is Max");
        }
    }
}
// String  vowel and consoant 
// java is learning platform 

// count :which one maximum vowel and consoanat