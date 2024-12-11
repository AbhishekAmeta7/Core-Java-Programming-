import java.util.ArrayList;
import java.util.Scanner;

public class MaxMinArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            al.add(x);
        }
        int max = al.get(0);
        int min = al.get(0);
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i)>max){
                max = al.get(i);
            }
            if(al.get(i)<min){
                min = al.get(i);
            }
        }
        System.out.println("Maximum Element: "+max);
        System.out.println("Minimum Element: "+min);
    }
}
// maximum element 