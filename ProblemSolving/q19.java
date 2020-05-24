import java.util.*;
public class q19
{
	public static void main(String [] args)
	{
	   System.out.println(" Please enter how many elements you want to enter in array 1 ");
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int[] ac = new int[n];
	   System.out.println("please enter elements in array 1 :");
	  for (int a = 0 ;a<n ;a++)
	  {
	   ac[a] = sc.nextInt();
	   }
	   System.out.println(" Please enter how many elements you want to enter in array 2 ");
	   int m = sc.nextInt();
	   int[] aa = new int[m];
	   System.out.println("please enter elements in array 2 :");
	  for (int f = 0 ;f<m ;f++)
	  {
	   aa[f] = sc.nextInt();
	   }
	   System.out.println("elements in array 1 : " );
	   for(int g=0; g<n; g++)
		   System.out.print(ac[g] + "  ");
	   System.out.println();
	   System.out.println("elements in array 2 : " ) ;
	   for(int h=0; h<m; h++)
		   System.out.print(aa[h] + "  ");
	   System.out.println();
	   System.out.println(" please choose a operation  ");
	    System.out.println("1: for union  ");
        System.out.println("2: for intersection ");
		int op = sc.nextInt();
		if(op==1)
		union(ac,aa);
	    else if (op==2)
			intersection(ac,aa);
		else 
		{
		System.out.println( " invalid choice ");
		
		}	
	}
	public static void union(int []ac,int []aa)
	{
		int a = ac.length + aa.length ;
		int [] ba = new int[a];
		int z=0;
		 for (int b =0 ; b<ba.length ; b++)
		{
			if (b<ac.length)
			{
				ba[b]=ac[b];
			}	
			if(b>ac.length)
			{
				ba[b]=	aa[z];
				z++;
			}			
		}
		System.out.println("union of array 1 and 2 is "); 
		 for (int w =0 ; w<ba.length ; w++)
		{
			System.out.println(ba[w] + "  ");
		}
	}
	public static void intersection(int []ac,int []aa)
	{
		int a = ac.length + aa.length ;
		int [] ba = new int[a];
		int z=0;
		if(ac.length>aa.length)
		{
		 for (int b =0 ; b<ac.length ; b++)
		{
			for(int x=0;x<aa.length;x++)
			{
				if(aa[x] == ac[b])
				{
				ba[z]=aa[x];
				z++;
				}
			}	
					
		}
		}
		 else if(aa.length>ac.length)
		{
		 for (int b =0 ; b<aa.length ; b++)
		{
			for(int x=0;x<ac.length;x++)
			{
				if(ac[x] == aa[b])
				{
				ba[z]=ac[x];
				z++;
				}
			}	
					
		}
		}
		System.out.println("intersection of array 1 and 2 is "); 
		 for (int w =0 ; w<ba.length ; w++)
		{
			System.out.println(ba[w] + "  ");
		}
	}
}	