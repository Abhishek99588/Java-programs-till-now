import java.util.Scanner;
public class calculator{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
int a,b;
char c;
System.out.println("Enter First Number");
a=obj.nextInt();
System.out.println("Enter Second Number");
b=obj.nextInt();
System.out.println("Press + to add\npress - to subtract\npress * to multiply\npress / to divide\npress % for reminder");
c=obj.next().charAt(0);
switch(c)
{
  case '+':System.out.println(a+"+"+b+"="+(a+b));
  break;
  case '-':System.out.println(a+"-"+b+"="+(a-b));
  break;
  case '*':System.out.println(a+"*"+b+"="+(a*b));
  break;
  case '/':System.out.println(a+"/"+b+"="+(a/b));
  break;
  case '%':System.out.println(a+"%"+b+"="+(a%b));
  break;
  default:System.out.println("Wrong Input Try Again");
  break;
}
}

}
