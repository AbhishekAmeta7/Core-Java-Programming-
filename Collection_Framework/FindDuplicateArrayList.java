import java.util.*;
public class FindDuplicateArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of An ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            al.add(x);
        }
        int count = 0;
        for (int i = 0; i < al.size(); i++) {
            for (int j = i+1; j < al.size(); j++) {
                if(al.get(i) == al.get(j)){
                    count++;
                    System.out.print(al.get(i)+" ");
                }
            }
        }
    }
}
// find duplicate and count in arraylist 