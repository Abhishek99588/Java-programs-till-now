import java.util.Scanner;
public class uname5nos{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
String a,b;
int  c,d,e,f,g;
System.out.println("Enter User Name");
a=obj.next();
System.out.println("Enter Password");
b=obj.next();
if(a.equals("niit@.com") && b.equals("niit12"))
{
  System.out.println("Welcome To Niit");
  System.out.println("Enter First Number");
  c=obj.nextInt();
  System.out.println("Enter Second Number");
  d=obj.nextInt();
  System.out.println("Enter Third Number");
  e=obj.nextInt();
  System.out.println("Enter Forth Number");
  f=obj.nextInt();
  System.out.println("Enter Fifth Number");
  g=obj.nextInt();
  if(c>d && c>e && c>f && c>g)
  {
  System.out.println(c+" Is The Greatest");
  }
  else if(d>e && d>f && d>g)
  {
  System.out.println(d+"  Is The Greatest");
  }
  else if(e>f && e>g)
  {
  System.out.println(e+" Is The Greatest");
  }
  else if(f>g){
    System.out.println(f+" Is The Greatest");
  }
  else
  {
    System.out.println(g+" Is The Greatest");
  }
}
else{
  System.out.println("Wrong Input");
}
}

}
