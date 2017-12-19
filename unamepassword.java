import java.util.Scanner;
public class unamepassword{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
String uname,pass;
System.out.println("Enter User Name");
uname=obj.next();
System.out.println("Enter Password");
pass=obj.next();
if(uname.equals("niit@.com")&& pass.equals("niit12"))
{
System.out.println("Welcome to niit");
}
else{
System.out.println("Wrong Input Try Again");
}
}

}
