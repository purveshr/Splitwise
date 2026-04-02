package com.splitwise.practiceCode;

public class PatternBuilder {

    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquare(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngledTriangle(int n){
        int i=0;
        while(i<n){
            int j=0;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void invertedRightTriangle(int n){
        int i=n;
        while(i>0){
            int j=0;
            while(j<i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void leftAlignedTriangle(int n){
        int i=0;
        while(i<n){
            int k =0;
            while(k<n-i-1){
                System.out.print("  ");
                k++;
            }
            int j=0;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void diamondPattern(int n){
        //Write a program that prints a diamond star pattern for a given odd integer N (height of the upper
        int i=1;
        while(i<=n){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        i-=2;
        while(i>0){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }

    public static void hollowSquare(int n){
        //Write a program that prints a hollow square star pattern of size N × N. Only the border should contain stars; the inside should contain spaces.
        int i=0;
        while(i<n){
            if(i==0 || i == n-1){
                for(int j=0;j<n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int j=0;j<n;j++){
                    if(j==0 || j==n-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            i++;
        }
    }

    public static void xPattern(int n){
//        X Pattern
//        Constraints:
//        1 ≤ n ≤ 100
//        n can be odd or even
//        Stars only at:
//        i == j
//        i + j == n - 1
        for(int i = 0; i<n; i++){
            int j=0;
            while(j<n){
                if(i==j || i+j == n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
        }


    }
}
