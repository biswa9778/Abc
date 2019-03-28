package practice;

import java.util.Scanner;

public class Aramstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int temp=0;
		int m=n;
		while(n>0)
		{
			int x=n%10;
			temp=temp+x*x*x;
			n=n/10;
			
		}
		
	//	System.out.println(temp);
		//System.out.println(n);
		if(temp==m)
		{
			System.out.println("is a armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}
				

	}

}
