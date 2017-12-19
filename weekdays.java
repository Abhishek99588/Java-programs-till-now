import java.util.Scanner;
public class weekdays{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
String a;
System.out.println("Enter Your Day");
a=obj.next();
switch(a)
{
  case "1":System.out.println("Monday");
  break;
  case "2":System.out.println("Tuesday");
  break;
  case "3":System.out.println("Wednesday");
  break;
  case "4":System.out.println("Thursday");
  break;
  case "5":System.out.println("Friday");
  break;
  case "6":System.out.println("Saturday");
  break;
  case "7":System.out.println("Sunday");
  break;
  default:System.out.println("Wrong input try again");
  break;
}
}

}
