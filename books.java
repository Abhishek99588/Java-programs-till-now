import java.util.Scanner;
public class books{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
int a,b,c,d,e,f,g,h1,h2,i;
System.out.println("Book Id.\tBook Name.\tBook Price\n01.\t\tC#.\t\t300/-Rs\n02.\t\tHTML.\t\t400/-Rs\n03.\t\tC++.\t\t500/-Rs\n04.\t\tJava.\t\t1000/-Rs\n");
System.out.println("Enter book id");
a=obj.nextInt();
if (a==1){
System.out.println("C#");
}
else if (a==2){
System.out.println("HTML");
}
else if (a==3){
System.out.println("C++");
}
else if (a==4){
System.out.println("Java");
}
else
{
System.out.println("Wrong Input Please Try Again");
}
System.out.println("Enter book price");
b=obj.nextInt();
if (b==300){
System.out.println("C#");
}
else if (b==400){
System.out.println("HTML");
}
else if (b==500){
System.out.println("C++");
}
else if (b==1000){
System.out.println("Java");
}
else
{
System.out.println("Wrong Input Please Try Again");
}
System.out.println("Enter Quantity");
c=obj.nextInt();
System.out.println(c);
System.out.println("01. Cash on Delievery\n02. Debit\n03. credit");
g=obj.nextInt();
if (g==1)
{
    switch(a){
        case 1: System.out.println("Book Name = C#");
            break;
        case 2: System.out.println("Book Name = HTML");
            break;
        case 3: System.out.println("Book Name = C++");
            break;
        case 4: System.out.println("Book Name = Java");
            break;
        default:System.out.println("wrong input");
            break;
    }
System.out.println("Book Price = "+b);
d=b*c;
System.out.println("Net Price = "+d);
e=d*9/100;
System.out.println("GST. \nCGST 9% = "+e+"\nSGST 9%= "+e);
f=e+e;
h1=d+f;
System.out.println("total price = "+h1);
}
else if(g==2 || g==3){
{
    switch(a){
        case 1: System.out.println("Book Name = C#");
            break;
        case 2: System.out.println("Book Name = HTML");
            break;
        case 3: System.out.println("Book Name = C++");
            break;
        case 4: System.out.println("Book Name = Java");
            break;
        default:System.out.println("wrong input");
            break;
    }
System.out.println("Book Price = "+b);
d=b*c;
System.out.println("Net Price = "+d);
e=d*9/100;
System.out.println("GST. \nCGST 9% = "+e+"\nSGST 9%= "+e);
f=e+e;
h1=d+f;
System.out.println("total price = "+h1);
i=(d+f)*9/100;
h2=(d+f)-i;
System.out.println("Discount 9%= -"+i);
System.out.println("total price = "+h2);
}

}
}
}
