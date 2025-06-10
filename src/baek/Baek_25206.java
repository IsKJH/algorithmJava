package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double score = 0.0;
        double score1 = 0.0;
        double subject = 0.0;
        for (int i = 0; i < 20; i++) {
            String[] arr = br.readLine().split(" ");
            if (!arr[2].equals("P")) {
                subject = Integer.parseInt(String.valueOf(arr[1].charAt(0)));
                score1 += subject;
                switch (arr[2]) {
                    case "A+":
                        score = score + (subject * 4.5);
                        break;
                    case "A0":
                        score = score + (subject * 4.0);
                        break;
                    case "B+":
                        score = score + (subject * 3.5);
                        break;
                    case "B0":
                        score = score + (subject * 3.0);
                        break;
                    case "C+":
                        score = score + (subject * 2.5);
                        break;
                    case "C0":
                        score = score + (subject * 2.0);
                        break;
                    case "D+":
                        score = score + (subject * 1.5);
                        break;
                    case "D0":
                        score = score + (subject * 1.0);
                        break;
                    case "F":
                        score = score + (subject * 0.0);
                        break;
                }
            }
        }
        System.out.println(score / score1);
    }
}