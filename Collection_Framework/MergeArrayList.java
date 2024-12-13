import java.util.*;
public class MergeArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of 1st ArrayList: ");
        int n1 = sc.nextInt();
        ArrayList<Integer> al1 = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            int x = sc.nextInt();
            al1.add(x);
        }

        System.out.print("Enter Size Of 2nd ArrayList: ");
        int n2 = sc.nextInt();
        ArrayList<Integer> al2 = new ArrayList<>(al1);
        for (int i = 0; i < n2; i++) {
            int x = sc.nextInt();
            al2.add(x);
        }

        for (Integer i : al2) {
            System.out.print(i+" ");
        }

    }
}
