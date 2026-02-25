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
            System.out.println("");
        }
    }

    public static void printSquare(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
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

}
