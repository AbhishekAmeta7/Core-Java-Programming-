
public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }          
    }
}


