import java.util.*;

public class SumOfArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            al.add(x);
        }
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }
        System.out.println("Sum Of All ArrayList Element: "+sum);
    }
}
// sum of all arraylist elements