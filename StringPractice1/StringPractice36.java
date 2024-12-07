public class StringPractice36 {
    public static void main(String[] args) {
        String s = "java is a platform independent language";
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == 'e'){
                count++;
            }
        }
        System.out.println("Count: "+count);
    }
}
// java is a platform independent language. 

// e :count  