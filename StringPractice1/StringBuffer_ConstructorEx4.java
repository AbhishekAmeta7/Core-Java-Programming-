public class StringBuffer_ConstructorEx4 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Java String");
        StringBuffer sb2 = new StringBuffer(sb1);
        System.out.println(sb2);
    }
}
