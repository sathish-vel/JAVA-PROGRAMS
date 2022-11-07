import java.util.Scanner;
import java.util.Arrays;
public class ArmStrong {
    public static void main(String[] args){
        int rem=0,i,count=0,num=0,sum=0,mul,new1=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the input number : ");
        int n=input.nextInt();
        num=n;
        new1=n;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
        while (num!=0){
            rem=num%10;
            mul=1;
            for(i=0;i<count;i++){
                mul=mul*rem;
            }
            sum+=mul;
            num=num/10;
        }
        if(sum==new1)
            System.out.println("this is armstrong number");
        else
        System.out.println("this is not a armstrong number");

            } 
}
