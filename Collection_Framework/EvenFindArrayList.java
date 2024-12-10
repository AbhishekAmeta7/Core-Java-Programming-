import java.util.*;
public class EvenFindArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.print("Enter Size Of ArrayList: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            al.add(x);
        }
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i)%2 ==0){
                System.out.print(al.get(i)+" ");
            }
        }
    }
}
// even number find in arraylist Collection_Framework