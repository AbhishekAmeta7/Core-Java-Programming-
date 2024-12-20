import java.util.*;
import java.lang.*;
import java.io.*;

class StringCodeChef2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int p = 0; p < T; p++){
		    String s1 = sc.next();
		    String s2 = sc.next();
		    char[] ch1 = s1.toCharArray();
		    char[] ch2 = s2.toCharArray();
		    char[] ch3 = new char[ch2.length];
		    int count = 0;
		    for(int i = 0; i < ch1.length; i++){
		        for(int j = 0; j <= i; j++){
		            if(ch1[i] == ch2[j]){
		                ch3[i]='G';
		                
		            }
		            else{
		               ch3[i] = 'B';
		                
		            }
		        }
		    }
		    for(int i = 0; i < ch3.length; i++){
		        System.out.print(ch3[i]);
		    }
		    System.out.println();
		}

	}
}
// 3
// ABCDE
// EDCBA   BBGBB

// ROUND
// RINGS   GBBBB

// START
// STUNT   GGBBG


