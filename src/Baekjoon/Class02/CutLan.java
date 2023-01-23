package Baekjoon.Class02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CutLan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]), K=Integer.parseInt(str[1]);
        int[] arr = new int[N];

        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = Arrays.stream(arr).sum();
        int num = sum/K;

        while(true){
            int cnt=0;
            for(int a:arr){
                cnt += a/num;
            }
            if(cnt == K){
                System.out.println(num);
                return;
            }
            num--;
        }
    }
}
