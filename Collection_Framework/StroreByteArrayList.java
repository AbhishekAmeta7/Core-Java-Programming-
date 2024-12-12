import java.util.*;
public class StroreByteArrayList {
    public static void main(String[] args) {
        ArrayList<Byte> al = new ArrayList<>();
        al.add((byte)3);
        al.add((byte)2);
        al.add((byte)4);
        al.add((byte)5);
        al.add((byte)1);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i)+" ");
        }
    }
}
