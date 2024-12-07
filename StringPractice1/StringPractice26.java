public class StringPractice26 {
    public static void main(String[] args) {
        String s = "regex is my learning platform";
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>='a' && ch[i]<='z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
// 2).string : 
// print 

// regex is my learning platform 
// count : number of characters 