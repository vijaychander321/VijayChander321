package primenumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag=1;
        for(int i=2;i<=n/2;i++) {
        	if(n%i==0) {
        		flag=0;
        	}
        }
        if(flag==1) {
        	System.out.println(n+" is a prime number");
        }
        else {
        	System.out.println(n+" is not a prime number");
        }
	}

}
