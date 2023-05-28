package come.core.java;

import java.util.Scanner;

public class Question3 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n, fact=1;
		System.out.println("Enter value");
		n=s.nextInt();
		
		
		for (int i = 1; i <= n; i++)
			
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of the given number is " +fact);
		s.close();
//	
//		int i=1;
//		while(i<=5)
//		{
//			
//			System.out.println("Enter value");
//			fact=s.nextInt();
//			
//			fact=fact*i;
//			System.out.println(i);
//			i++;
//		}
//	
	
	}
	
	
}
