import java.util.*;
public class ArrayListFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            al.add(x);
        }
        for (int i = 0; i < al.size(); i++) {
            int fact = 1;
            for(int j = 1; j<= al.get(i); j++){
                fact = fact * j;
            }
            System.out.print(fact+" ");
        }
    }
}
// factorial of number 