
import java.util.Scanner;

public class Swapnumbers {
    // swap funtion using 3rd variable 
    public static void swap_num(int num1,int num2){
        int tem = num1;
        num1=num2;
        num2=tem;
    }
    // swap funtion without using 3rd variable
    public static void swap_num2(int num1 ,int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2 ;
    }

    // main funtion
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int num2 = sc.nextInt();
        sc.close();
        swap_num2(num1,num2);
        System.out.printf("%d , %d",num1,num2);
    }
}
