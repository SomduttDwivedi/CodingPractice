import java.util.*;
public class q17
{
	public static void main(String [] args)
	{
	   System.out.println(" Please enter how many elements you want to enter in array : ");
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int[] ac = new int[n];
	  for (int a = 0 ;a<n ;a++)
	  {
	   ac[a] = sc.nextInt();
	   }
	   System.out.println("please enter a number to find in list " );
	   int num = sc.nextInt();
	   findInList(ac,num);
	}
	public static void findInList(int []ac,int num)
	{
		 for (int b =0 ; b<ac.length ; b++)
		{
			if (ac[b]==num)
			System.out.println("Number is present at location : " + (b+1) );
		}
	}
}	