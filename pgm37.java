import java.util.Scanner; 
class SwapNumber
{
   public static void main(String args[])
   {
      int r, s, temp; 
      Scanner input = new Scanner(System.in);
      r= input.nextInt();
      s= input.nextInt(); 
      temp = r;
      r= s;
      s= temp;
      System.out.println(r+" "+s);
   }
}
