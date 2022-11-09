import java.util.*;
public class ReverseMatrix{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int b[][]=new int[3][3];

System.out.println("Array of matrix : ");
for(int i=0;i<3;i++){
 for(int j=0;j<3;j++){
  System.out.print(" "+a[i][j]);
 }
 System.out.println();
}
for(int i=0;i<3;i++){
 for(int j=0;j<3;j++){
  b[j][i]=a[i][j];
 }
}
System.out.println("After Reversed Matrix : ");
for(int i=0;i<3;i++){
 for(int j=0;j<3;j++){
  System.out.print(" "+b[i][j]);
 }
 System.out.println();
}	
}
}