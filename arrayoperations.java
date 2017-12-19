import java.util.Scanner;
public class arrayoperations{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
String[] names=new String[3];
names[0]="Blue Shirt";
names[1]="Red Shirt";
names[2]="Black Shirt";
int[] numbers={100,200,300};
for(String name:names){
  System.out.println("Name: "+name);
}
for(int number:numbers){

  System.out.println("Number: "+number);
}
}

}
