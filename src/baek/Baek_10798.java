package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String[] answer = new String[5];
        int maxlength = 0;

        for (int i = 0; i < 5; i++) {
            answer[i] = br.readLine();
            maxlength = Math.max(maxlength, answer[i].length());
        }

        for (int j = 0; j < maxlength; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < answer[i].length()) {
                    System.out.print(answer[i].charAt(j));
                }
            }
        }

    }
}