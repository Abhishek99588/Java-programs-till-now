import java.util.Scanner;
public class evenoddifelse{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
int a,b;
System.out.println("Enter Your Number");
a=obj.nextInt();
b=(a%2);
if(b==0){
  System.out.println(a+" is even");
}
else{
  System.out.println(a+" is odd");
}
}

}
