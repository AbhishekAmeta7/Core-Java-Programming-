public class For_Practice8{
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 50; i<=1000; i++) {
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.print("50--->1000 even number sum: "+sum);
    }
}
//9)50--->1000 even number sum
