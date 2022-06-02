package javapatterns;


public class Main {
    public static void main(String[] args) {
        pattern23(3);
    }
    static void pattern23(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");

            System.out.println();
        }
    }
    static void pattern25(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if (j==1||j==n){
                    System.out.print("*");
                } else if (i==1||i==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    static void pattern24(int n){
        for (int i = 1; i <=n ; i++) {
            if(i<=(n/2)){
                for (int j = 1; j <=i ; j++) {
                    if (j==1||j==i){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                for (int j = 1; j <=n-2*i ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=i ; j++) {
                    if (j==1||j==i){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }

            }
            else {
                for (int j = n-i; j>=0; j--) {
                    if (j==n-i||j==0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                for (int j = 2; j <2*(i-(n/2)) ; j++) {
                    System.out.print(" ");
                }
                for (int j = n-i; j>=0; j--) {
                    if (j==n-i||j==0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
    static void pattern22(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
               if (i%2==0 && j==1) {
                   System.out.print(0+" ");
               } else if (j%2!=0 && i%2==0) {
                   System.out.print(0+" ");
               }
               else if (j%2==0 && j!=i && i%2!=0) {
                   System.out.print(0+" ");
               }
               else {
                   System.out.print(1+" ");
               }

            }
            System.out.println();
        }
    }
    static void pattern21(int n){
        int count = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    static void pattern18(int n){
        for (int i = 0; i <n ; i++) {
            if (i<(n/2)){
                for (int j = 1; j <=(n/2)-i ; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j <2*i ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=(n/2)-i ; j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int j = 1; j<=i+1-(n/2); j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <=n-2*(i+1-(n/2)) ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j<=i+1-(n/2); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int i = 1; i <=n ; i++) {
            if (i<=(n+1)/2){
                for (int j = 1; j <=((n+1)/2)-i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j>0 ; j--) {
                    System.out.print(j);
                }
                for (int j = 2; j<=i; j++) {
                    System.out.print(j);
                }
            }
            else{
                for (int j = 1; j <=i-((n+1)/2) ; j++) {
                    System.out.print(" ");
                }
                for (int j = n+1-i; j>0; j--) {
                    System.out.print(j);
                }
                for (int j = 2; j <=n+1-i ; j++) {
                    System.out.print(j);
                }
            }


            System.out.println();
        }
    }
    static  void pattern16(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <=n-1-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i*2+1; j++) {
                if (j%2==0){
                    System.out.print("  ");
                }
                if(j==1||j==i*2+1){
                    System.out.print(1+" ");
                }
                if (j%2!=0 && j!=1 && j<i*2+1){
                    int k=i;
                    if ( j==n && i==n-1){
                        k=n+1;
                    }
                    System.out.print(k+" ");
                }

            }

            System.out.println();
        }
    }
    static void pattern15(int n){
        for (int i = 1; i <=n; i++) {
            if (i<=(n/2)){

                for (int j = 1; j <=((n+1)/2)-i ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if (i>1 && i<n){
                    for (int j =1; j<=2*i-3;j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            }
            else {
                for (int j = 1 ; j<i-(n/2) ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if (i>1 && i<n){
                    for (int j = 1; j <=n-2*(i-(n/2)); j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            }

            System.out.println("");
        }
    }
    static void pattern14(int n){

        for (int i = 1; i <=n; i++) {
            for (int j = 1 ; j<i ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i==1){
                for (int j = 1; j <=2*n-2; j++) {
                    System.out.print("*");
                }
            }
            if (i>1 && i<n){
                for (int j = 1; j <=2*(n+1-i)-3 ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern13(int n){

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i>1 && i<n){
                for (int j =1; j<=2*i-3;j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if (i==n){
                for (int j = 1; j <=2*n-2; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    static void pattern12(int n){
        for (int i = 1; i <=n ; i++) {
            if (i<=(n/2)){
                for (int j = 1; j <=i ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=(n/2)+1-i ; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = 1; j <=(n/2)+1-(i-(n/2)); j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=i-(n/2) ; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println("");
        }
    }
    static void pattern11(int n){
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern10(int n){
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern8(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern9(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern7(int n){
        for (int i = 1; i<=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print("*");
            }



            System.out.println("");
        }
    }
    static void pattern6(int n){
        for (int i = 1; i<=n ; i++) {
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
    static  void pattern5(int n){
        for (int i = 1; i<=n ; i++) {
            if (i<=(n/2)){
                for (int j = 1; j <=i ; j++) {
                    System.out.print("* ");
                }
            }
            else if (i>(n/2)) {
                    for (int j = 1; j <=n+-i; j++) {
                        System.out.print("* ");
                    }
            }

            System.out.println("");
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
