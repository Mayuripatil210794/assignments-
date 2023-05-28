package come.core.java;

import java.util.Scanner;

public class Question1
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		 
		int larger, temp, a,b,c;
		
		System.out.println("Enter First Number");
		a= sc.nextInt();
		System.out.println("Enter Second number");
		b=sc.nextInt();
		System.out.println("Enter Third Number"); 
		c=sc.nextInt();   
		
		temp=a>b?a:b;
		larger=c>temp?c:temp;
		
		System.out.println("the greatest number is " +larger);
		sc.close();
	}
}
