import java.util.Scanner;
public class findgreater{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
int a,b;
System.out.println("Enter Number 01");
a=obj.nextInt();
System.out.println("Enter Number 02");
b=obj.nextInt();
if(a>b)
{
System.out.println(a+" is the Greatest");

}
else{
  System.out.println(b+" is the Greatest");
}
}

}
