package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Virus {
    static int[][] virus;
    static boolean[] check;
    static int N;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        int link = Integer.parseInt(br.readLine());
        int tmpX, tmpY;

        virus = new int[N + 1][N + 1];
        check = new boolean[N + 1];

        for (int i = 0; i < link; i++) {
            st = new StringTokenizer(br.readLine());
            tmpX = Integer.parseInt(st.nextToken());
            tmpY = Integer.parseInt(st.nextToken());

            virus[tmpX][tmpY] = virus[tmpY][tmpX] = 1;
        }
        bfs(1);

        System.out.println(cnt);
    }

    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        check[start] = true;

        while (!queue.isEmpty()) {
            start = queue.poll();


            for (int i = 1; i < N + 1; i++) {
                if (virus[start][i] == 1 && !check[i]) {
                    queue.add(i);
                    check[i] = true;
                    cnt++;
                }
            }
        }
    }
}
