public class For_Practice10{
    public static void main(String[] args) {
        int sum = 0;
        for(int i= 1000;i>=500;i--){
            if(i%2 != 0){
                sum = sum+i;
            }
        }
        System.out.print("1000--->500 odd numbers sum: "+sum);
    }
}
//10)1000--->500 odd numbers sum