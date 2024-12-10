import java.util.*;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        System.out.println("Integer: "+ al1);
        ArrayList<Float> al2 = new ArrayList<>();
        al2.add(111.4f);
        al2.add(33.4f);
        al2.add(12.456f);
        System.out.println("Float: "+al2);
        ArrayList<Long> al3 = new ArrayList<>();
        al3.add(1845392394584l);
        al3.add(25896854956l);
        al3.add(38685876854l);
        System.out.println("Long: "+al3);
        ArrayList<Double> al4 = new ArrayList<>();
        al4.add(157645.4);
        al4.add(435644.5);
        al4.add(356564.7);
        System.out.println("Double: "+al4);
        ArrayList<Boolean> al5 = new ArrayList<>();
        al5.add(true);
        al5.add(false);
        al5.add(true);
        System.out.println("Boolean: "+al5);
        ArrayList<Character> al6 = new ArrayList<>();
        al6.add('J');
        al6.add('a');
        al6.add('v');
        al6.add('a');
        System.out.println("Character: "+al6);
    }
}