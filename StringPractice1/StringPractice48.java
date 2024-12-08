public class StringPractice48 {
    public static void main(String[] args) {
        String s = "1231056";
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= '0' && ch[i] <='9'){
                count++;
            }
            else{
                break;
            }
        }
        if(count == ch.length){
            System.out.println("string contains only numeric characters");
        }
        else {
            System.out.println("string not contains only numeric characters");
        }
    }
}
// Write a Java program to check if a string contains only numeric characters.