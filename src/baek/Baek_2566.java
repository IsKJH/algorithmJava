package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int row = 0;
        int col = 0;
        int num = 0;
        for (int i = 0; i < 9; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                int brNum = Integer.parseInt(str[j]);
                if (num < brNum) {
                    num = brNum;
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(num);
        System.out.println(row + 1 + " " + (col + 1));
    }
}