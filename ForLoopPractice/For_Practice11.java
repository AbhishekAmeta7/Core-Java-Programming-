import java.util.Scanner;;
public class For_Practice11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i<=n2; i++) {
            for(int j = 1;j<=10;j++){
                int result = i*j;
                System.out.println(i+" x "+j+" = "+result);
            }
            System.out.println();
        }
    }
}
//table print between range from user input