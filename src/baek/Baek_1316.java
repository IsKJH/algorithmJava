package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < size; i++) {
            String str = br.readLine();

            boolean[] chk = new boolean[26];
            boolean flag = true;

            for (int j = 0; j < str.length(); j++) {
                char currentChar = str.charAt(j);
                int index = currentChar - 'a';

                if (chk[index]) {
                    if (j == 0 || str.charAt(j - 1) != currentChar) {
                        flag = false;
                        break;
                    }
                } else {
                    chk[index] = true;
                }
            }

            if (flag) {
                count++;
            }
        }

        System.out.println(count);
    }
}