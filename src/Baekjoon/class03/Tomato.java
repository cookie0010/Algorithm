package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {
    static int[][] tomato;
    static boolean[][] check;
    static int X, Y;
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        tomato = new int[X + 1][Y + 1];
        check = new boolean[X + 1][Y + 1];

        // 토마토 값 세팅
        for (int i = 1; i < X + 1; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j < Y + 1; j++) {
                int inputTomato = Integer.parseInt(st.nextToken());
                tomato[i][j] = inputTomato;

                if (inputTomato == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        // 너비우선 탐색
        bfs();

        //체크
        int max = 0;
        for (int i = 1; i < X+1; i++) {
            for (int j = 1; j < Y+1; j++) {
                if (tomato[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(tomato[i][j], max);
            }
        }

        System.out.println(max - 1);
    }

    static void bfs() {
        int[] moveX = {0, 0, 1, -1};
        int[] moveY = {1, -1, 0, 0};

        while (!queue.isEmpty()) {
            int[] start = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = start[0] + moveX[i];
                int y = start[1] + moveY[i];

                if (x < 1 || x > X || y < 1 || y > Y) {
                    continue;
                }

                if (!check[x][y] && tomato[x][y] == 0) {
                    tomato[x][y] = tomato[start[0]][start[1]] + 1;
                    check[x][y] = true;
                    queue.offer(new int[]{x, y});
                }
            }
        }
    }
}
