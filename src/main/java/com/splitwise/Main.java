package com.splitwise;


import com.splitwise.practiceCode.pyramid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an number :");
        int n = sc.nextInt();
        pyramid.printPyramid(n);
    }
}