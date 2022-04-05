package armstrong;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        int org=n;
        int arm=0,rem;
        while(n!=0) {
        	rem=n%10;
        	arm+=rem*rem*rem;
        	n/=10;
        }
        if(org==arm) {
        	System.out.println(org+" is a armstrong number");
        }
        else {
        	System.out.println(org+" is not a  armstrong number");
        }
	}

}
