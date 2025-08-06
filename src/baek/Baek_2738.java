package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n1 = Integer.parseInt(arr[0]);
        int n2 = Integer.parseInt(arr[1]);

        int[][] list1 = new int[n1][n2];
        int[][] list2 = new int[n1][n2];

        for (int i = 0; i < n1; i++) {
            String[] arr1 = br.readLine().split(" ");
            for (int j = 0; j < n2; j++) {
                list1[i][j] = Integer.parseInt(arr1[j]);
            }
        }

        for (int i = 0; i < n1; i++) {
            String[] arr2 = br.readLine().split(" ");
            for (int j = 0; j < n2; j++) {
                list2[i][j] = list1[i][j] + Integer.parseInt(arr2[j]);
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(list2[i][j] + " ");
            }
            System.out.println();
        }
    }
}