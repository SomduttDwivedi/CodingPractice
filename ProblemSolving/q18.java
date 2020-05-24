import java.util.*;
public class q18
{
	public static void main(String [] args)
	{
	 
	   Scanner sc = new Scanner(System.in);
	   int[] ac ={1,2,3,4,5,6,7,7,7,8,8,9,9,9,10,11,12,13,13,13,13,13,13,15,16,17};
	 
	   System.out.println("please enter a number to find its frequency" );
	   int num = sc.nextInt();
	   findInList(ac,num);
	}
	public static void findInList(int []ac,int num)
	{
		int count=0;
		 for (int b =0 ; b<ac.length ; b++)
		{
			if (ac[b]==num)
			{
			count++;	
			
			}
		}
		System.out.println("given Number occured in list  : " + count + " times "  );
	}
}	