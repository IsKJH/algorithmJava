    package baek;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

    public class Baek_3003 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = br.readLine().split(" ");
            int[] list = new int[str.length];
            int[] answer = {1, 1, 2, 2, 2, 8};
            for (int i = 0; i < str.length; i++) {
                list[i] = Integer.parseInt(str[i]);
            }
            for (int i = 0; i < list.length; i++) {
                System.out.print(answer[i] - list[i] + " ");
            }
        }
    }