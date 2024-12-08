import java.util.*;
public class StringPractice44 {
    public static void main(String[] args) {
        String s = "Hello How Are You";
        boolean b = s.startsWith("Hello");
        if(b==true){
            System.out.println("Start With Given Prefix");
        }
        else {
            System.out.println("Not Start With Given Prefix");
        }
    }
}
// Write a Java program to check if a string starts with a given prefix.