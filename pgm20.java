import java.util.Scanner;  
	 class Factorial {  
	   public static void main(String[] args) {  
	       Scanner r = new Scanner(System.in);  
	        
	       int number = r.nextInt();  
	    
	  int i,fact=1;  
	    
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println(fact);    
	 
	}
	}  
