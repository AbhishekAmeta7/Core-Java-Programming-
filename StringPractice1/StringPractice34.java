public class StringPractice34 {
    public static void main(String[] args) {
        String s = "java is a platform independent language";
        char[] ch = s.toCharArray();
        char c = 'e';
        int x = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == c){
                System.out.println("index: "+i);
                x=1;
                break;
            }
        }
        if(x>0){
            System.out.println("Yes "+c+" is Present");
        }
    }
}
// java is a platform independent language. 

// e :first time : index :present 