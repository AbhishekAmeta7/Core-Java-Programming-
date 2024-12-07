public class StringPractice12 {
    public static void main(String[] args) {
        String s = "java is a learning platform";
        char[] ch = s.toCharArray(); 
        for(int i = 0; i < ch.length; i++){
            for(int j = i+1; j < ch.length; j++){
                if(ch[i]==ch[j]){
                    ch[j]=0;
                }
            }
            if(ch[i]>0){
                System.out.print(ch[i]+" ");
            }
        }
    }
}
// String :
// java is learning platform 

// duplicate character remove 