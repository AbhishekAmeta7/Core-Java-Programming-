import java.util.*;
public class CountEvenArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            al.add(x);
        }
        int count = 0;
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i)%2==0){
                count++;
            }
        }
        System.out.println("Total Even Element: "+count);
    }
}
// even number count in arraylist 