
import java.util.Scanner;
 class Power
{
   public static void main(String arg[])
	
   {
	
       long n,p,r=1;
	
       Scanner sc=new Scanner(System.in);
 
   
	  
       n=sc.nextLong();
 
   
	  
       p=sc.nextLong();
 
       if(n>=0&&p==0)
       {   
          r =1;
       }
       else if(n==0&&p>=1)
	{   
            r=0;
	} 
       else
	{ 
              for(int i=1;i<=p;i++)
	       { 
                   r=r *n;
 	 	}    
  	 }    
 
    	  System.out.println(+r);
 
    }
 
}