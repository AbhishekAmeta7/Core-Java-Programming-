import java.util.Scanner;
public class SwitchAssign{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("<--Hotel Menu-->");
       System.out.println("1->Burger\n2->Cold Coffee\n3->Pizza\n4->Banana Shake\n5->Paneer Paratha\n6->Cold drink\n7->Chole bhature\n8->Milk Cake\n9->matka Kulfi\n10->Fruit Juice");
       System.out.print("Enter Choice: ");
       int ch = sc.nextInt();
       switch (ch) {
        case 1:
            System.out.print("Burger: ");
            int b = sc.nextInt();
            int price = 100;
            int total = price*b;
            int per=0,dis = 0;
            if(b>2 && b<=10){
            
                per = total*10/100;
                dis = total-per;
                System.out.println("Price: "+total);
                System.out.println("After Discount: "+dis);
            }
            else if(b>10){
                per = total *25/100;
                dis = total-per;
                System.out.println("Price: "+total);
                System.out.println("After Discount: "+dis);
            }
            else{
                System.out.println("Price: "+price);
            }
            break;
        case 2:
            System.out.print("Cold Coffee: ");
            int cc = sc.nextInt();
            price = 150;
            total = price*cc;
            System.out.println("Total Prize: "+total);
            break;
        case 3:
            System.out.print("Pizza: ");
            int p = sc.nextInt();
            price = 250;
            total = price*p;
            if(p>=5 && p<=10){ 
                per = total*25/100;
                dis = total-per;
                System.out.println("Price: "+total);
                System.out.println("After Discount: "+dis);
            }
            else if(p>10){
                per = total*40/100;
                dis = total-per;
                System.out.println("Price: "+total);
                System.out.println("After Discount: "+dis);
            }
            else{
                System.out.println("Price: "+total);
            }
            break; 
        case 4:
            System.out.print("Banana Shake: ");
            int ba = sc.nextInt();
            price = 80;
            total = price*ba;
            System.out.println("Banana Shake: "+ba);
            System.out.println("Price: "+total);
            break;    
        case 5:
               System.out.print("Paneer Paratha: ");
               int pp = sc.nextInt();
               price = 70;
               total = price * pp;
               System.out.println("Paneer Paratha: "+pp);
               System.out.println("Price: "+total);
               break;
            case 6:
               System.out.print("Cold drink: ");
               int cd = sc.nextInt();   
               price = 20;
               total = price*cd;
               System.out.println("Cold Drink: "+cd); 
               System.out.println("Price: "+total);
               break;
            case 7:
                System.out.print("Chole bhature: ");
                int cb = sc.nextInt();
                price = 130;
                total = price*cb;
                System.out.println("Chole bhature: "+cb);
                System.out.println("Price: "+total);
                break;
            case 8:
                System.out.print("Milk Cake: ");
                int mk = sc.nextInt();
                price = 450;
                total = price*mk;
                System.out.println("Milk Cake: "+mk);
                System.out.println("Price: "+total);
                break;
            case 9:
                System.out.print("Matka Kulfi: ");
                int nmk = sc.nextInt();
                price = 60;
                total=nmk*price;
                System.out.println("Matka Kulfi: "+nmk);
                System.out.println("Price: "+total);
                break;
            case 10:
                System.out.println("Fruit Juice: 50");
                 break;          
        default:
            System.out.println("Invalid Choice");
            break;
       }
    }
}
/*8): 1 -->10 cases 
as u wish patterns 
*/ 