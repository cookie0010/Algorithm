package Baekjoon.Class02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MineCraft {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] land = new int[N][M];

        // 값 초기화
        for(int i = 0;i<N;i++){
            st = new StringTokenizer(br.readLine());

            for(int j=0;j<M;j++){
                land[i][j] = Integer.parseInt(st.nextToken());
            }
        }

    }

    static void ToInventory(){

    }

    static void PutBlock(){

    }
}
