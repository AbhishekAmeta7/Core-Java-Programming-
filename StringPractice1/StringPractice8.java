public class StringPractice8 {
    public static void main(String[] args) {
        String s = "hello world";
        char ch[] = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if(ch[i] == ch[j]){
                    System.out.print(" "+ch[i]+""+i+" ");
                    count++;
                }
            }
        }
        System.out.println("\nCount: "+count);
    }
}
// string duplicate character find 

// index + character 
// count duplicate 