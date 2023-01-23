package Baekjoon.Class02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CutLanBinarySort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        long K=Integer.parseInt(str[1]);
        long[] arr = new long[N];
        long max=0;

        // 비교할 값 초기화
        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = max<arr[i]?arr[i]:max;
        }

        // 여기부터 이분탐색
        long start = 1, mid = 0, end = max;
        while(start <= end){
            mid = (start+end)/2;

            long sum = 0;
            for(long a:arr){
                sum += a / mid;
            }

            if (sum >= K) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println(end);
    }
}
