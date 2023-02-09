package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(makeMin(N, 0));
    }

    static int makeMin(int X, int count) {
        if (X < 2) {
            return count;
        }
        return Math.min(makeMin(X / 2, count + 1 + X % 2), makeMin(X / 3, count + 1 + X % 3));
    }
}
