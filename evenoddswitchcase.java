import java.util.Scanner;
public class evenoddswitchcase{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
int a,b;
System.out.println("Enter Your Number");
a=obj.nextInt();
b=(a%2);
switch (b)
{
  case 0:System.out.println("even");
  break;
  default:System.out.println("odd");
  break;
}
}

}
