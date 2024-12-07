public class StringBufferMethod9 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
}
