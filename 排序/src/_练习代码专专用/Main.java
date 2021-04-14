package _练习代码专专用;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] index = new int[m+1];
        for (int i = 1; i <= m; i++) {
            index[i] = sc.nextInt();
        }
        int[] times = method(n, m, index);
        System.out.print(times[1]);
        for (int i = 2; i <= n; i++) {
            System.out.print(" " + times[i]);
        }
    }

    public static int[] method(int n, int m, int[] index) {
        int[] times = new int[n+1];
        for (int i = 1; i <= n; i++) {
            times[i] = 1;
        }
        for (int i = 1; i <= m; i++) {
            int end = index[i];
            for (int j = 1; j < end; j++) {
                times[j] += 1;
            }
        }
        return times;
    }
}
