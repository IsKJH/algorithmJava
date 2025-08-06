package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[100][100];
        int paper = Integer.parseInt(br.readLine());

        for (int i = 0; i < paper; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            // 색종이 크기는 10x10이므로 < y+10, < x+10 까지 반복
            for (int j = y; j < y + 10; j++) {
                for (int k = x; k < x + 10; k++) {
                    if (j < 100 && k < 100) {
                        arr[j][k] = 1; // 겹치지 않더라도 칠해졌다는 표시
                    }
                }
            }
        }

        // 결과: 총 칠해진 칸 수
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 1) count++;
            }
        }

        System.out.println(count);
    }
}