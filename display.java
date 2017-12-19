import java.util.Scanner;
public class display{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
String a,b,c,d,e;
long f;
System.out.println("Enter Your Name");
a=obj.next();
System.out.println("Enter Your Parents Name");
b=obj.next();
System.out.println("Enter Your Mobile Number");
f=obj.nextLong();
System.out.println("Enter Your E-Mail");
c=obj.next();
System.out.println("Enter Your Date Of Birth");
d=obj.next();
System.out.println("Enter your Address");
e=obj.next();
System.out.println("Your Name Is "+a+"\nYour Parents Name Is "+b+"\nYour Mobile Number Is "+f+"\nYour E-Mail Is "+c+"\nYour Date Of Birth Is "+d+"\nYour Address Is "+e);
}

}
