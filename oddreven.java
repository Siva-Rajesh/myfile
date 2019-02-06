import java.util.Scanner;
 
 
 public class oddreven
{
    public static void main(String  args[])
    {
        int num;
       System.out.print("input ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
         System.out.print(num);
       System.out.print("output ");
        if(num%2==0)
        {
            System.out.println( "even ");}
        
        else if(num<=0) 
        {
            System.out.println("invalid ");
        }
        else
        {
            System.out.println("Odd");
        
        }
    }
}
    


        


