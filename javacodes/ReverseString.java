
import java.util.Scanner ;


public class ReverseString {

    // Reverse String Function
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
        Scanner sc = new Scanner(System.in) ;
        System.out.println("ENTER A STRING :  ") ;
        String input = sc.nextLine();
        sc.close();
        String revstr = rev_str(input);
        System.out.println(revstr);
    }
}
