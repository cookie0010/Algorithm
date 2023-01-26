package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Cabbage {
    static int[][] land;
    static boolean[][] check;
    static int M;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 테스트 나누기
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            land = new int[M][N];
            check = new boolean[M][N];

            // 값 입력
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                land[X][Y] = 1; // 배추가 심어진 좌표 입력
            }

            int count = 0; // 지렁이 갯수

            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (land[j][k] == 1 && !check[j][k]) {
                        bfs(j, k);

                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    private static void bfs(int startX, int startY){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{startX, startY});

        // 처음 들어가는 값은 배추가 있으니까 true로 초기화
        check[startX][startY] = true;

        // 움직일 수 있는 좌표 지정
        int[] X = {0, 0, -1, 1};
        int[] Y = {-1, 1, 0, 0};

        while (!q.isEmpty()) {
            int[] poll = q.poll();

            for (int i = 0; i < 4; i++) {
                int x = poll[0] + X[i];
                int y = poll[1] + Y[i];

                if (x < 0 || x >= M || y < 0 || y >= N) {
                    continue;
                }

                if (land[x][y] == 1 & !check[x][y]) {
                    q.offer(new int[]{x, y});
                    check[x][y] = true;
                }
            }
        }
    }
}
