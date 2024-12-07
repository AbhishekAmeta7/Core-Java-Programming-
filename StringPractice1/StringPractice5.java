public class StringPractice5 {
    public static void main(String[] args) {
        String s = "java is learning platform";
        char[] ch = s.toCharArray();
        int count = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i]!='a'&&ch[i]!='e'&& ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u'){
                count++;
                System.out.print(ch[i]+" "+i+" ");
            }
        }

        System.out.println("\nCount: "+count);
    }
}
// String find consonant  
// java is learning platform 
   
// index print with character 
// count total 