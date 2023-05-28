package come.core.java;

import java.util.Scanner;

public class Question9
{
public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		int [][] a=new int [3][3];
		int [][] b=new int [3][3];
		int [][] c=new int [3][3];
		
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c.length; j++)
			{
				System.out.println(" enter number a[" +i+"]["+j+"]: ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Start array of b");
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c.length; j++)
			{
				System.out.println(" enter number b[" +i+"]["+j+"]: ");
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Sum of 2D array");
			for (int i = 0; i < c.length; i++) 
			{
				for (int j = 0; j < c.length; j++)
				{
					
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(" " +c[i][j]);
			
				}
				System.out.println();
			}
			sc.close();
	}
}
