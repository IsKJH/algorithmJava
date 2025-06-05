package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }

        int maxCnt = 0;
        char answer = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCnt) {
                maxCnt = count[i];
                answer = (char) ('A' + i);
            } else if (count[i] == maxCnt && maxCnt > 0) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}