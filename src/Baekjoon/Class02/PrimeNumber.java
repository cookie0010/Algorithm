package Baekjoon.Class02;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean[] prime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        prime = new boolean[end+1];
        findPrime(end); // 체 생성

        for(int i=start; i<end+1; i++){
            if(!prime[i]) System.out.println(i);
        }
    }
    public static void findPrime(int end){
        prime[0]=prime[1]=true;

        int N = (int)Math.sqrt(end);
        for(int i=2; i<=N; i++){
            for(int j=2; i*j<=end; j++){
                prime[i*j] = true;
            }
        }
    }
}


