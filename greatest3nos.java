import java.util.Scanner;
public class greatest3nos{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
int a,b,c;
System.out.println("Enter First Number");
a=obj.nextInt();
System.out.println("Enter Second Number");
b=obj.nextInt();
System.out.println("Enter Third Number");
c=obj.nextInt();
if(a>b  && a>c)
{
System.out.println(a+" is the greatest");
}
else if(b>c)
{
  System.out.println(b+ " is the greatest");
}
else{
  System.out.println(c+ " is the greatest");
}
}

}
