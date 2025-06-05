package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Baek_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int size = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String str = br.readLine();
            Set<String> set = new HashSet<>();
            set.add(String.valueOf(str.charAt(0)));
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j - 1) != str.charAt(j)) {
                    set.add(String.valueOf(str.charAt(j)));
                }
                if (str.charAt(j - 1) != str.charAt(j) && set.contains(String.valueOf(str.charAt(j)))) {
                    break;
                } else {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}