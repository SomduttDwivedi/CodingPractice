import java.util.*;
public class q12
{
	
	public static void main(String []args)
	{
		System.out.println("please enter a number to insert  in array ");
		//int[] a = new int[25]; 
	int[]  a ={1,2,3,4,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,0,0,0,0};
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		insertElement(a, num);
	}
     public static void insertElement(int[] a , int num )
     {
		 int temp =0,temp2=0,b=0;
       for (b =0; b<a.length-1 ;b++)
	   {
	   if ((a[b] <=num) && a[b+1] >=num )
	   {
		    temp = a[b+1];
			a[b+1]=num;
			break;
	   }
	   }
		   for(int d=b+1; d<(a.length-3);d++)
		   {
		   
		   a[d+1] = temp;
		   temp2 = a[d+2];
		   temp = temp2;
		   }
	   
	   
	   System.out.print("elements after deletion in arra is  : ");
	    for (int c =0; c<a.length ;c++)
	   {
		System.out.print(a[c] + " ");
	   }
	 }

}
	 