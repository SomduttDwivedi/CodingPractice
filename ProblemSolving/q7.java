import java.util.*;
public class q7
{
	public static void main (String []args)
	{
		int num1,num2;
		System.out.println("Please enter two numbers to find lcm and hcf of given  numbers : " );
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("please select your choice ");
		System.out.println(" 1 : LCM ");
		System.out.println(" 2 : HCF ");
		int choice = sc.nextInt();
		if(choice == 1)
			lcm(num1,num2);
		else if(choice == 2)
			hcf(num1,num2);
		else 
			System.out.println(" invalid choice ");
	}
	 
	 public static void lcm(int num1,int num2)
	 {
		 
       if (num1 > num2)
	   {
		   for(int i=2 ;i<num1;i++)
		   {
			   if ((num1%i)==0 && (num2%i)==0)
			   {
				   System.out.println( " lcm of given numbers is  : " + i);
			   break ;
			   }
		   }
	   }
      else	  
      {
         	for(int i=2 ;i<num2;i++)
		   {
			   if ((num1%i)==0 && (num2%i)==0)
			   {
				   System.out.println( " lcm of given numbers is  : " + i);
			   break ;
			   }
		   }
	  }	   
	 }
	 public static void hcf(int num1,int num2)
	 {
		 
       if (num1 > num2)
	   {
		   for(int i=num2 ;i>0;i--)
		   {
			   if ((num1%i)==0 && (num2%i)==0)
			   {
				   System.out.println( "hcf of given numbers is  : " + i);
			   break ;
			   }
		   }
	   }
      else	  
      {
         	for(int i=num1 ;i>0;i--)
		   {
			   if ((num1%i)==0 && (num2%i)==0)
			   {
				   System.out.println( " hcf of given numbers is  : " + i);
			       break ;
			   }
		   }
	  }	   
	 }
}	 