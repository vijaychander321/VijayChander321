package automarphic;

import java.util.Scanner;

public class Automarphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);   
		int num =s.nextInt();  
		int count=0;  
		int square = num*num;   
		int temp = num;    
		while(temp>0)  
		{  
		count++;  
		temp=temp/10;  
		}    
		int lastDigit = (int) (square%(Math.pow(10, count)));     
		if(num == lastDigit)  
		System.out.println(num+ " is an automorphic number.");  
		else  
		System.out.println(num+ " is not an automorphic number.");  
	}

}
