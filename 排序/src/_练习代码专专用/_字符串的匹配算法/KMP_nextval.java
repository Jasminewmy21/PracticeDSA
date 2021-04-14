package _练习代码专专用._字符串的匹配算法;

/**
 * KMP优化:  实质上减少了j的回溯
 *
 *
 */
public class KMP_nextval {
    public static void main(String[] args) {
        String s = "aaaafbrdaaaasiaallaaaabvbifaaasdb";
        String t = "aaaab";
        int res = kmpIndex(s, t);
        System.out.println(res);
    }

    private static int kmpIndex(String s, String t) {
        int[] next = getNext(t);
        int[] nextval = getNextval(t, next);
        int i = 1, j = 1;
        while (i <= s.length() && j <= t.length()) {
            if (j == 0 || s.charAt(i-1) == t.charAt(j-1)) {
                ++i;
                ++j;
            } else {
                j = nextval[j];
            }
        }
        if (j > t.length()) {
            return i - t.length() - 1;
        } else {
            return -1;
        }
    }

    private static int[] getNextval(String t, int[] next) {
        int[] nextval = new int[t.length() + 1];
        nextval[1] = 0;
        for (int j = 2; j <= t.length(); j++) {
            if (t.charAt(next[j-1]) == t.charAt(j-1)) {
                nextval[j] = nextval[next[j]];
            } else {
                nextval[j] = next[j];
            }
        }
        return nextval;
    }

    private static int[] getNext(String t) {
        int[] next = new int[t.length() + 1];
        int i = 1, j = 0;
        next[1] = 0;
        while (i < t.length()) {
            if (j == 0 || t.charAt(i) == t.charAt(j)) {
                ++i;
                ++j;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        return next;
    }
}
