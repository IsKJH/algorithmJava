package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Baek_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s));
        ArrayList<String> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);

        System.out.println(list.equals(reversed) ? 1 : 0);
    }
}