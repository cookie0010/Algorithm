package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());
            arr[i] = tmp;
        }

        for (int i = N - 1; i >= 0; i--) {
            if (K / arr[i] > 0) {
                cnt += K / arr[i];
                K = K % arr[i];
            }
        }
        System.out.println(cnt);
    }
}
