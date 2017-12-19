import java.util.Scanner;
public class tableforloop{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
int a,i;
System.out.println("Enter Number To Print Table");
a=obj.nextInt();
for(i=1;i<=10;i++)
{
  System.out.println(a+"*"+i+"="+(a*i));
}
}

}
