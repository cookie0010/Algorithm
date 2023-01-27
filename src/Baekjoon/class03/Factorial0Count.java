package Baekjoon.class03;

import java.util.Scanner;

public class Factorial0Count {
    static int Five = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N / 5 + N / 25 + N / 125);
    }
}
