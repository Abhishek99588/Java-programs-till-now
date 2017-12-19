import java.util.Scanner;
public class vovelconsonent{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
char a;
System.out.println("Enter Your Alphabet");
a=obj.next().charAt(0);
switch (a){
  case'A':System.out.println("Vovel");
  break;
  case'E':System.out.println("Vovel");
  break;
  case'I':System.out.println("Vovel");
  break;
  case'O':System.out.println("Vovel");
  break;
  case'U':System.out.println("Vovel");
  break;
  case'a':System.out.println("Vovel");
  break;
  case'e':System.out.println("Vovel");
  break;
  case'i':System.out.println("Vovel");
  break;
  case'o':System.out.println("Vovel");
  break;
  case'u':System.out.println("Vovel");
  break;
  default:System.out.println("Consonent");
  break;
}
}

}
