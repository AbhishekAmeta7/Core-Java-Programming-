public class ArrayPractice24 {
    public static void main(String[] args){
        String s = "java is programming java language";
        String[] s1 = s.split(" ");
        int count = 0;
        for(int i = 0; i < s1.length; i++){
            for(int j=i+1; j < s1.length; j++){
                if(s1[j].equals(s1[i])){
                    count++;
                    System.out.print(s1[i]);
                    System.out.println("\nIndex: "+j);
                }
            }
            
        }

        System.out.println("\nCount: "+count);
    }
}
// java is programming java language :

// 	duplicate word :which 
// 	index 
// 	count