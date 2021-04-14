package _练习代码专专用;

public class Solution {
    public static void main(String[] args) {

    }
    public static int  rand10() {
        int index;
        do {
            index = (rand6() - 1) * 6 + rand6() - 1;
        } while (index => 30);
        return index % 10 + 1;
    }

    private static int rand6() {
        return Math.random() * 6 + 1;
    }
}
