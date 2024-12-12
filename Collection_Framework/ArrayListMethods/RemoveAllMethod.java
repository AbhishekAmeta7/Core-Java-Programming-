import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveAllMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            al.add(x);
        } 
        System.out.println(al);
        al.removeAll(al);
        System.out.println(al);
    }
}
