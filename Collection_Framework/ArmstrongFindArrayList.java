import java.util.*;
public class ArmstrongFindArrayList {
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
            int ans = 0 , temp = al.get(i);
            while(temp>0){
                int a = temp%10;
                ans += a*a*a;
                temp /= 10;
            } 
            if(al.get(i) == ans){
                System.out.print(al.get(i)+" ");
            }
        }
    }
}
// Armstrong number