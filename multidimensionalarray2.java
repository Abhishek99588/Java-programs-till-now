import java.util.Scanner;
class multidimensionarray2{
public static void main(String...ar){
Scanner obj=new Scanner(System.in);
int a,b;
a=obj.nextInt();
b=obj.nextInt();
int arr[][]=new int[a][b];
for(int i=0;i<a;i++){
  for(int j=i;j<b;j++){

    arr[i][j]=obj.nextInt();
  }
}
for(int i=0;i<a;i++){
  for(int j=0;j<b;j++){
    System.out.print(arr[i][j]);
      }System.out.println();
}
}


}
