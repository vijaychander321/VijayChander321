package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int org=n;
        int rev=0,rem;
        while(n!=0) {
        	rem=n%10;
        	rev=rev*10+rem;
        	n=n/10;
        }
        if(org==rev) {
        	System.out.print(org+" is a palindrome");
        }
        else {
        	System.out.println(org+" is not a palindrome");
        }
	}

}
