import java.util.Scanner;

class beg4

{

public static void main(String args[])

{

char ch;

Scanner scan = new Scanner(System.in);


ch=scan.next().charAt(0);

System.out.print("\n"+ch+"\n");



if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))

{

System.out.print("Alphabet");

}

else

{

System.out.print("No");

}

}

}
