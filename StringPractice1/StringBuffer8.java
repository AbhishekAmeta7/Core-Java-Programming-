public class StringBuffer8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(50);
        sb.append("Hello");
        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}
