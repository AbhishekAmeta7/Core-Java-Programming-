import java.util.Scanner;
public class For_Practice16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--:Choice:--\neven\nodd");
        System.out.print("Enter Your Choice: ");
        String ch = sc.next();
        if(ch.equals("even")){
            System.out.println("Enter two number for range: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            for(int i = n1;i<=n2;i++){
                if(i%2 == 0){
                    System.out.print(i+" ");
                }
            }
        } 
        else if(ch.equals("odd")){
            System.out.println("Enter two number for range: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            for(int i = n1;i<=n2;i++){
                if(i%2 != 0){
                    System.out.print(i+" ");
                }
            }
        }
        else{
            System.out.println("! Invalid Choice !");
        }
    }
}
/*
 9)write and make a program user give two string like even and odd even
  denoted even number and odd denoted odd number when user input odd then 
  input a range and calculate even and odd number in java ?(use if else if and for loop) 
*/