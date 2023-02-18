package Baekjoon.Class05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TermProject {
    static int [][] student;
    static int [][] check;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        // 각 테스트
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            student = new int[N+1][N+1];
            check = new int[N + 1][N + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 그래프 그리기
            for (int j = 1; j < N+1; j++) {
                for (int k = 1; k < N + 1; k++) {
                    int to = Integer.parseInt(st.nextToken());
                    student[j][to] = 1;
                    break;
                }
            }

            // dfs
            for (int j = 1; j < N + 1; j++) {
                for (int k = 0; k < N + 1; k++) {
                    if (student[j][k] == 1) {
                        dfs(i);
                        break;
                    }
                }
            }

        }
    }

    static void dfs(int start) {
        check = new int[N + 1][N + 1];

        for (int i = 1; i < N; i++) {

        }

    }
}
