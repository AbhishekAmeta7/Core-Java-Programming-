public class For_Practice6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i<=100; i++) {
            if(i%2==0){
                sum = sum+i;
            }
        }
        System.out.print("Sum Of Even Number 1-100: "+sum);
    }
}
//7)1--->100 even number print sum