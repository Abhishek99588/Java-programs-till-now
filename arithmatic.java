import java.util.Scanner;
public class arithmatic{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
int a,b,c,d,e,f;
System.out.println("Enter First Number");
a=obj.nextInt();
System.out.println("Enter Second Number");
b=obj.nextInt();
c=a+b;
d=a-b;
e=a*b;
f=a/b;
System.out.println("Addition is = "+c+"\nSubtraction is = "+d+"\nMultiplicantion is = "+e+"\nDivision is = "+f);
}

}
