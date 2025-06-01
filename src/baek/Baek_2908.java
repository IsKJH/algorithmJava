package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        String temp1 = str[0];
        String temp2 = str[1];

        String temp_1 = String.valueOf(temp1.charAt(2)) + String.valueOf(temp1.charAt(1)) + String.valueOf(temp1.charAt(0));
        String temp_2 = String.valueOf(temp2.charAt(2)) + String.valueOf(temp2.charAt(1)) + String.valueOf(temp2.charAt(0));
        System.out.println(Math.max(Integer.parseInt(temp_1), Integer.parseInt(temp_2)));
    }
}