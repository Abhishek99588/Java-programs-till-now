import java.util.Scanner;
public class starpattern3{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
int i,j,k;
for(i=1;i<=6;i++)
{
  for (j=1;j<=10;j++)
  {
    if (j<7-i||j>=5+i)
    {
      System.out.print("*");
    }
    else
    {
      System.out.print(" ");
    }
  }System.out.println();
}
for(i=10;i>=6;i++)
{
  for (j=10;j<=10;j++)
  {
    if (j<7-i||j>=5+i)
    {
      System.out.print("*");
    }
    else
    {
      System.out.print(" ");
    }
  }System.out.println();
}
}
}
