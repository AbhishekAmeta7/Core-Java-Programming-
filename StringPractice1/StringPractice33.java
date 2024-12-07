public class StringPractice33 {
    public static void main(String[] args) {
        String s = "java is a platform independent language";
        char[] ch = s.toCharArray();
        int count = 0;
        char c = 'e';
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==c){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println(c+" is present");
        }
        else{
            System.out.println(c+" is Not Present");
        }
    }
}
// java is a platform independent language. 

// e :present 