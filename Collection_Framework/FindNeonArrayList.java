import java.util.*;
public class FindNeonArrayList {
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
            int ans = 0,sqr = al.get(i)*al.get(i);
            while(sqr>0){
                int a = sqr%10;
                ans = ans+a;
                sqr /= 10;
            }
            if(ans == al.get(i)){
                System.out.print(al.get(i)+" ");
            }
        }
    }
}
// neon number