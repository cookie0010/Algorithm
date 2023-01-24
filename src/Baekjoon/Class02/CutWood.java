package Baekjoon.Class02;

import java.util.Scanner;

public class CutWood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextInt(), max = 0;
        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            max = max<arr[i]?arr[i]:max;
        }

        // 이분 탐색
        long start = 1, end = max, mid=0;
        while(start <= end){
            long sum = 0;
            mid = (start + end) / 2;
            for (long a : arr) {
                if (a > mid) {
                    sum += (a - mid);
                }
            }
            if(sum >= M){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(end);
    }
}
