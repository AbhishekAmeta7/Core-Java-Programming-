import java.util.*;
public class StringArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ArrayList: ");
        int n = sc.nextInt();
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            al.add(s);
        }
        for (int i = 0; i < al.size(); i++) {
            char[] ch = al.get(i).toCharArray();
            int countWowel = 0;
            int countConsonent = 0;
            for (int j = 0; j < ch.length; j++) {
                if(ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u'){
                    countWowel++;
                }
                else{
                    countConsonent++;
                }
            }
            System.out.println("------X------");
            System.out.println(al.get(i));
            System.out.println("vowel: "+countWowel);
            System.out.println("Consonent: "+countConsonent);
        }
    }
}
// string :
// every object :vowel and consoant (count)