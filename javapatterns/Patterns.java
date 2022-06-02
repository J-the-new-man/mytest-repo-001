package javapatterns;


import java.util.Locale;

public class Patterns {
    public static void main(String[] args) {
        pattern27();
    }
    static void pattern27(){
        for (int i = 1; i <=4 ; i++) {
            for (int j = 4; j>0 ; j--) {
                System.out.print(4-j);
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int i = 1; i <=n ; i++) {
            if (i<=(n+1)/2){
                for (int j = 1; j <=((n/2)+1)-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=i ; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = 1; j <=i-(n+1)/2 ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=(n+1)-i ; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
    static void pattern29(int n){
        for (int i =1; i <=n ; i++) {
        if (i<=((n+1)/2)){
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j =(n+1)-2*i; j>0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
        }
        else {
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=(i-((n+1)/2))*2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print("*");
            }
        }
            System.out.println();
        }
    }
    static void pattern32(int n){
        String alph = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 1; i <= n ; i++) {
            for (int j=1; j<=i ; j++) {
               char p = alph.toUpperCase().charAt(n-i+j-1);
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
    static void pattern34(int n){
        String alph = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 1; i <=n ; i++) {
            for (int j=n-i; j>=0; j--) {
                char p = alph.toUpperCase(Locale.ROOT).charAt(j);
                System.out.print(p+" ");

            }
            System.out.println();
        }
    }
    static void pattern35(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j>=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
