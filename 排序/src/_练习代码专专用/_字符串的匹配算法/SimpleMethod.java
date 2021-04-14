package _练习代码专专用._字符串的匹配算法;

/**
 * 朴素(简单)模式匹配算法
 *
 * 模式串t长度为m, 主串的长度n
 * T: 最好O(m), 最坏O(nm)
 *
 * 缺点:
 *      当某些子串与模式串能部分匹配的时候,主串的扫描指针i经常回溯,导致额外时间开销
 */

public class SimpleMethod {
    public static void main(String[] args) {
        String s = "KrisWu";
        String t = "Wu";
        int index = index(s, t);
        System.out.println(index);
    }

    private static int index(String s, String t) {
        int k = 0;
        int i = k, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                ++i;
                ++j;
            } else {
                k++;
                i = k;
                j = 0;
            }
        }
        if (j == t.length()) {
            return k;
        } else {
            return 0;
        }
    }
}
