package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toCharArray();
        int time = 0;
        for (char c : ch) {
            if (c >= 65 && c <= 67) {
                time += 3;
            } else if (c >= 68 && c <= 70) {
                time += 4;
            } else if (c >= 71 && c <= 73) {
                time += 5;
            } else if (c >= 74 && c <= 76) {
                time += 6;
            } else if (c >= 77 && c <= 79) {
                time += 7;
            } else if (c >= 80 && c <= 83) {
                time += 8;
            } else if (c >= 84 && c <= 86) {
                time += 9;
            } else if (c >= 87 && c <= 90) {
                time += 10;
            }
        }
        System.out.println(time);


    }
}