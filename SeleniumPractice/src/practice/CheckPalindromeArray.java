package practice;//check palindrome or not for a inteser array

import java.util.Scanner;
public class CheckPalindromeArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int st=sc.nextInt();
		int arr[]=new int[st];
		System.out.println("enter the array elements");
		for(int i=0;i<st;i++)
		{
			arr[i]=sc.nextInt();
		}
for(int i=0;i<st;i++)
{
	int n=arr[i];
	int temp=0;
	while(arr[i]>0)
	{
		int d=arr[i]%10;		
		temp=temp*10+d;
	arr[i]=arr[i]/10;
	}
	System.out.println(temp);
	if(temp==n)
	{
		System.out.println("is a palindrome=="+n);
	}
	}
			}
	}
