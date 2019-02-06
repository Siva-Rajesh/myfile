class oddreven
{
    public static void main(String  args[])
    {
        int num;
       
        Scanner sc=new Scanner(System.in);
         
        System.out.print(" ");
        num=sc.nextInt();
         
       
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


