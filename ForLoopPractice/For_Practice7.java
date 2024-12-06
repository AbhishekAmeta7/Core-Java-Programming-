public class For_Practice7{
    public static void main(String[] args) {
        int sum = 0;
        for (int i=100; i>=1; i--) {
            if(i%2 != 0){
                sum = sum + i;
            }
        }
        System.out.println("Sum Of Odd Number 1-100: "+sum);
    }
}
//8)100---->1odd number print sum