import java.util.*;
public class q20
{
	public static void main(String [] args)
	{
	   System.out.println(" Please enter elemints in list  And press enter to stop feeding : ");
	   Scanner sc = new Scanner(System.in);
	   int[] a = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	   
	   System.out.println("please enter a number less than 20 to find in list " );
	   int num = sc.nextInt();
	   findInList(a,num);
	}
	public static void findInList(int[] a,int num)
	{
		 for (int b =0 ; b<a.length ; b++)
		{
			if (a[b]==num)
			System.out.println("Number is present at location : " + (b+1) );
		 else if ((b== a.length)&&(a[b]!=num)) 
			 System.out.println("number is not present in the list " );
		}
	}	
	
}	