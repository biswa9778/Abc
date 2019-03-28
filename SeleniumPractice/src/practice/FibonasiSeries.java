package practice;

import java.util.Scanner;

public class FibonasiSeries {

	public static void main(String[] args) {
		
			
			/* int n1=0;
			 int n2=1;
			 int n3;
			 int i;
			 int count=10;  
			 System.out.print(n1+" "+n2);//printing 0 and 1  
			  
			 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
			 {  
			  n3=n1+n2;  
			  System.out.print(" "+n3);  
			  n1=n2;  
			  n2=n3;  
			 }*/
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int m=sc.nextInt();
		int n1=1;
		int n2=0;
		int sum=0;
		System.out.println(n1);
		for(int i=2;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
			n2=j;
				sum=n1+n2;	
			if(j==1)
				{
					System.out.print(1);
				}
				 if(j<=m||j==i)
				{
					System.out.print(sum);
				}
			n1=n2;
			n2=sum;
				
			}
			System.out.println(" ");
		}
		

			}}


	


