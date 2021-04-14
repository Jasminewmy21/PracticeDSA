package com.itheima03;

public class StringBuilder05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = arrayToString(arr);
        System.out.println(s);
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();

    }
}
