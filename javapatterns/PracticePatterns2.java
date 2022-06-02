package javapatterns;

import java.util.Locale;

public class PracticePatterns2 {

    public static void main(String[] args) {
        pattern33(5);

    }
    static void pattern33(int r){
        String alph ="abcdefghijklmnopqrstuvwxyz";
        int k=0;
        for (int i = 1; i <=r ; i++) {
            for (int j = 0; j <i ; j++) {
                char p;
                if (k%2!=0 && k!=0){
                    p = alph.toUpperCase(Locale.ROOT).charAt(k);
                }
                else{
                    p = alph.charAt(k);
                }
                System.out.print(p+" ");
                k++;
            }
            System.out.println("");
        }
    }
    static void pattern26(int r){
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <=r-i+1 ; j++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
    static void pattern30(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print((i-j)+" ");
            }
            for (int j = 1; j <=i ; j++) {
                if (j!=1){
                    System.out.print((j)+" ");
                }
            }
            System.out.println("");
        }
    }
    static void pattern31(){
        for (int i = 1; i <=7; i++) {
            for (int j = 1; j <=7 ; j++) {
                if (i==1||i==7||j==1||j==7){
                    System.out.print("4 ");
                }
                else if (i==2||i==6||j==2||j==6) {
                    System.out.print("3 ");
                }
                else if (i==3||i==5||j==3||j==5) {
                    System.out.print("2 ");
                }
                else if (i==4||j==4) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    static void pattern20(int l,int b){
        for (int i = 1; i <=l ; i++) {
            for (int j = 1; j <=b ; j++) {
                if (i==1 || j==1 || i==l || j==b){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
