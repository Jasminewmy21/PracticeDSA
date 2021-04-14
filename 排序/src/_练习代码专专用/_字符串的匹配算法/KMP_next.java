package _练习代码专专用._字符串的匹配算法;

/**
 * KMP算法:
 *
 * 当子串和模式串不匹配时, 主串指针i不回溯,只有模式串的指针j回溯, j = next[j]
 *
 * 怎么求j回溯到哪里的数组next是关键
 *      按照序号j从1开始:
 *      next[1] = 0;
 *      next[j] = S的最长相等前后缀长度 + 1;
 *
 * KMP的算法平均时间复杂度是: O(m+n)
 */
public class KMP_next {
    public static void main(String[] args) {
        String s = "kriswu";
        String t = "wu";
        int index = findStrIndex(s,t);
        System.out.println(index);
    }

    private static void getNext(String t, int[] next) {
        int i = 1, j = 0;
        next[1] = 0;
        while (i < t.length()) {//O(m)的来源
            if (j == 0 || t.charAt(i-1) == t.charAt(j-1)) {
                ++i;
                ++j;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
    }

    private static int findStrIndex(String s, String t) {
        int[] next = new int[t.length()+1];
        getNext(t, next);

        int i = 1, j = 1;
        while (i <= s.length() && j <= t.length()) {//O(n)的来源
            if (j == 0 || s.charAt(i-1) == t.charAt(j-1)) {
                //继续比较后继字符
                ++i;
                ++j;
            } else {
                //模式串指针回溯
                j = next[j];
            }
        }
        if (j > t.length()) {
            return i - t.length() - 1;//匹配成功
        } else {
            return -1;
        }
    }

}
