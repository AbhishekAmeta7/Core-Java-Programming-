public class StringPractice18 {
    public static void main(String[] args) {
        String s = "hello world";
        char[] ch = s.toCharArray();
        char[] ch1 = new char[ch.length];
        for(int i = 0; i < ch.length; i++){
            ch1[i] = ch[i];
            if(i==1){
                ch1[i] = 'a';
            }
        }
        for (char c : ch) {
            System.out.print(c+"");
        }
        System.out.println();
        for (char c : ch1) {
            System.out.print(c+"");
        }
    }
}
// String :hello world 

// first character --->second character 
// e ---->a 
// hallo world (replace )