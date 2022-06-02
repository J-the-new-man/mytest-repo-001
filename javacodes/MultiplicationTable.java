
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]){

        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++){
            int mul = i*num;
            System.out.println(num+" X "+i+" = "+mul);
            // System.out.print(" X ");
            // System.out.println(num*i);
        }

    }
}
