import java.util.Scanner;
public class stringoperator{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
String a,b,c;
b="world";
c=" ";
c="hello".concat(b);
System.out.println("String : "+c);
System.out.println("Length : "+b.length());
System.out.println("Sub : "+c.substring(0,5));
System.out.println("upper : "+c.toUpperCase());
}

}
