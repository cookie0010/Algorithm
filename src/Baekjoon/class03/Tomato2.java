package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato2 {
    static int X,Y,Z;
    static int[][][] tomato;
    static boolean[][][] check;
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        Z = Integer.parseInt(st.nextToken());

        tomato = new int[X+1][Y+1][Z+1];
        check = new boolean[X+1][Y+1][Z+1];
        int inputTomato;

        // 토마토 값 입력
        for (int i = 1; i < Z + 1; i++) {
            for (int j = 1; j < X + 1; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 1; k < Y + 1; k++) {
                    inputTomato = Integer.parseInt(st.nextToken());
                    tomato[j][k][i] = inputTomato;
                    if (inputTomato == 1) {
                        queue.offer(new int[]{j, k, i});
                        check[j][k][i] = true;
                    }
                }
            }
        }

        bfs();

        int max = 0;
        // 체크
        for (int i = 1; i < Z + 1; i++) {
            for (int j = 1; j < X + 1; j++) {
                for (int k = 1; k < Y + 1; k++) {
                    if (tomato[j][k][i] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    max = Math.max(max, tomato[j][k][i]);
                }
            }
        }

        System.out.println(max-1);
    }

    public static void bfs() {

        int[] moveX = new int[]{1, -1, 0, 0, 0, 0};
        int[] moveY = new int[]{0, 0, 1, -1, 0, 0};
        int[] moveZ = new int[]{0, 0, 0, 0, 1, -1};

        while (!queue.isEmpty()) {
            int[] start = queue.poll();

            for (int i = 0; i < 6; i++) {
                int tmpX = start[0] + moveX[i];
                int tmpY = start[1] + moveY[i];
                int tmpZ = start[2] + moveZ[i];

                if (tmpX < 1 || tmpX > X || tmpY < 1 || tmpY > Y || tmpZ < 1 || tmpZ > Z) {
                    continue;
                }
                if (!check[tmpX][tmpY][tmpZ] && tomato[tmpX][tmpY][tmpZ] == 0) {
                    tomato[tmpX][tmpY][tmpZ] = tomato[start[0]][start[1]][start[2]] + 1;
                    queue.offer(new int[]{tmpX, tmpY, tmpZ});
                    check[tmpX][tmpY][tmpZ] = true;
                }
            }
        }

    }
}
