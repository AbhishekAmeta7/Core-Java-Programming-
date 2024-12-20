import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j = 0; j<n; j++){
            String s = sc.next();
            char[] ch = s.toCharArray();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int i = 0; i < ch.length; i++){
                if(i%2 == 0) {
                    sb1.append(ch[i]);
                }
                else{
                    sb2.append(ch[i]);
                }
            }
            String s1 = sb1.toString();
            String s2 = sb2.toString();
            System.out.println(s1+" "+s2);
        }
    }
}