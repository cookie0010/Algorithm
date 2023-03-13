package Baekjoon.class03;

import java.io.*;
import java.util.*;

public class RemoteController {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 입력 받은 채널
        boolean[] button = new boolean[10];

        int M = Integer.parseInt(br.readLine());
        if (M != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                button[Integer.parseInt(st.nextToken())] = true;    // 고장난 버튼 체크
            }
        }

        // 최솟값 설정. +, -만 사용한 경우.
        int least = Math.abs(N - 100);

        if (M == 10) {
            System.out.println(least);
            return;
        }

        int i = 0;
        while (true) {
            int plusDigit = 0;
            int minusDigit = 0;
            int plusN = N + i;
            int minusN = N - i;

            while (plusN / 10 != 0) {
                if (button[plusN % 10] == false) {
                    plusDigit++;
                    plusN = plusN / 10;
                    if (plusN / 10 == 0) {
                        if (button[plusN % 10] == false) {
                            plusDigit++;
                            least = Math.min(i + plusDigit, least);
                            System.out.println(least);
                            return;
                        }else{
                            break;
                        }
                    }
                }else{
                    break;
                }
            }

            while (minusN / 10 != 0) {
                if (button[plusN % 10] == false) {
                    minusDigit++;
                    minusN = minusN / 10;
                    if (minusN / 10 == 0) {
                        if (button[minusN % 10] == false) {
                            minusDigit++;
                            least = Math.min(i + minusDigit, least);
                            System.out.println(least);
                            return;
                        }else{
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            i++;
        }

    }
}
