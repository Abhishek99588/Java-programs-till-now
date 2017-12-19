import java.util.Scanner;
public class multiarr{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
int arr[][]=new int[3][5];
for(int i=0;i<3;i++){
for(int j=0;j<5;j++){
arr[i][j]=obj.nextInt();
}
}
for(int i=0;i<3;i++){
for(int j=0;j<5;j++){
System.out.print(arr[i][j]+" ");
}System.out.println();
}

}

}
