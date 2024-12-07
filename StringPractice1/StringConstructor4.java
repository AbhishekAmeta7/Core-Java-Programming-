public class StringConstructor4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        String s = new String(sb);
        System.out.println(s);
    }
}
