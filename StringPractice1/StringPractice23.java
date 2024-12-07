public class StringPractice23 {
    public static void main(String[] args){
        String s = "java is a learning platform";
        char[] ch = s.toCharArray();
        int target = 'a';
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'a'){
                ch[i] = 'A';
            }
        }
        for(int i = 0; i < ch.length; i++){
            System.out.print(ch[i]);
        }
    }
}
// string :
// java is a learning platform 

// a :a all convert upper case 