package _练习代码专专用;

import java.io.*;
import java.util.*;
/*
* reset
reset board
board add
board delet
reboot backplane
backplane abort
* */
public class Practice {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            String[] arr = s.split(" ");
            String res = method(arr);
            System.out.println(res);
        }
    }

    private static String method(String[] arr) {
        Map<String, String> map = new HashMap<>();
        map.put("reset", "reset what");
        map.put("reset board", "board fault");
        map.put("board add", "where to add");
        map.put("board delete", "no board at all");
        map.put("reboot backplane", "impossible");
        map.put("backplane abort", "install first");
        map.put("noMatch", "unknown command");

        Set<String[]> str = new HashSet<>();
        for (String s : map.keySet()) {
            str.add(s.split(" "));
        }

        String res = "noMatch";
        int count = 0;
        for (String[] s : str) {
            if (arr.length == 1) {
                if (s.length == 2)
                    continue;
                else {
                    if (s[0].startsWith(arr[0])) ;
                    res = s[0];
                }
            }
            if (arr.length == 2) {
                if (s.length == 1)
                    continue;
                else {
                    if (s[0].startsWith(arr[0]) && s[1].startsWith(arr[1])) {
                        res = s[0] + " " + s[1];
                        count++;
                    }
                }
            }
        }
        return count > 1 ? map.get("noMatch") : map.get(res);
    }
}