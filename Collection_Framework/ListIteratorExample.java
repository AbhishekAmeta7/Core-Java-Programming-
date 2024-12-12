import java.util.*;
public class ListIteratorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of List: ");
        int n = sc.nextInt();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            l.add(s);
        }
        ListIterator litr = l.listIterator();
        System.out.println("<---Iterate Forward Direction--->");
        while(litr.hasNext()) {
            System.out.print(litr.next()+" ");
        }
        System.out.println("\n<---Iterate Backward Direction--->");
        while (litr.hasPrevious()) {
            System.out.print(litr.previous()+" ");
        }
    }
}
