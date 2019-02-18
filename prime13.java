import java.util.Scanner;
class prime
{
   public static void main(String args[])
   {		
	int a;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);


	int num=scan.nextInt();
        scan.close();
	for(int i=2;i<=num/2;i++)
	{
           a=num%i;
	   if(a==0)
	   {
	      isPrime=false;
	      break;
	   }
	}

	if(isPrime)
	   System.out.println( " yes");
	else
	   System.out.println( " no");
   }
}
