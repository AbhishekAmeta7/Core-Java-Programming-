public class StringPractice40 {
    public static void main(String[] args) {
        String s = "";
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            count++;
        }
        if(count<=0){
            System.out.println("String is Empty");
        }
        else{
            System.out.println("String Is Not Empty");
        }
    }
}
// Write a Java program to check if a string is empty.