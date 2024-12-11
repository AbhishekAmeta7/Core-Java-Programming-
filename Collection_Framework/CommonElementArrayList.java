import java.util.*;
public class CommonElementArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al1.add(7);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(2);
        al2.add(3);
        al2.add(6);
        al2.add(4);
        al2.add(7);
        for (int i = 0; i < al1.size(); i++) {
            for (int j = 0; j < al2.size(); j++) {
                if(al1.get(i).equals(al2.get(j))){
                    System.out.print(al1.get(i)+" ");
                }
            }
        }
    }
}
// two array common element 