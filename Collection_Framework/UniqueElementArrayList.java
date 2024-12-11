import java.util.*;

public class UniqueElementArrayList {
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
            for (int j = i+1; j < al.size(); j++) {
                if(al.get(i).equals(al.get(j))){
                    al.set(i,0);
                    al.set(j,0); 
                }
            }
            if(al.get(i)>0){
                System.out.print(al.get(i)+" ");
            }
        }
    }
}
