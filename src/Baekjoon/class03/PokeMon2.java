package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PokeMon2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, String> map = new HashMap();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N+1; i++) {
            String pokemon = br.readLine();
            map.put(Integer.toString(i), pokemon);
            map.put(pokemon, Integer.toString(i));
        }

        for (int i = 0; i < M; i++) {
            String test = br.readLine();
            sb.append(map.get(test)).append("\n");
        }

        System.out.println(sb);
    }
}
