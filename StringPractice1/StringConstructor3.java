public class StringConstructor3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        String s = new String(sb);
        System.out.println(s);
    }
}
