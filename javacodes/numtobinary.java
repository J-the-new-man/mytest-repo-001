
import java.util.Scanner;


public class numtobinary {
    // Reverse Function
    public static String rev_str (String strin){

        String newstr = "";
        for(int i=strin.length()-1;i>=0;i--){
            char ch = strin.charAt(i) ;
            newstr+=ch ;
        }
        return newstr ;
    }
    // Main Function
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number  : ");
        int num = sc.nextInt();
        sc.close();
        
        int temp = num ;
        String binum = "";
        while( temp>1){
            if(temp%2==0){
                binum+=0;
            }else{
                binum+=1;
            }
            temp= temp/2;
        }
        String output = rev_str(binum);
        System.out.println(output);

    }
}
