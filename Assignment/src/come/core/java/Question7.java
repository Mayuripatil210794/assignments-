package come.core.java;

public class Question7 
{
	/***********Pattern 1
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * 
	 */
	public static void main(String[] args) {
//		for (int i = 1; i <=6; i++) 
//		{
//			for (int j = 1; j <i; j++) 
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}

		/***********Pattern 2
		 * 1
		 * 01
		 * 101
		 * 01010
		 * 101010
		 * 
		 */
//		for (int i = 0; i <=7; i++) 
//		{
//			for (int j = 1; j <i; j++) 
//			{
//				System.out.print(j%2);
//			}
//			System.out.println();
//		}
//	
		/***********Pattern 3
		 * 	  		1
		 * 	 	  2	 2	
		 *	    3   3  3
		 *	  4	  4   4  4
		 */
		for (int i = 1; i <= 4; i++) 
		{
  
            for (int j = 1; j <=4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
	
	
	}
}
