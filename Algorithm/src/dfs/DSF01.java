package dfs;

/**
 * 在构造树的过程中dfs，将搜索到的节点入栈（回溯）栈的作用就是回溯，
 * 如果只是先序遍历那么打印的结果就是1，2，3 ； 3，2 … … 节点1不会重复打印，
 * 所以这块用栈来实现回溯，每访问一个节点，入栈，每回退一个节点，出栈，
 * 如果访问到的是叶子节点，那么直接输出栈中的所有元素，这样就实现了全排列。
 */
public class DSF01 {
    private static Integer x = new Integer(1);
    public static void X(Integer value) {
        value = 2 * value;
    }
    public static void main(String[] args) {
      X(x);

        System.out.println(x);
    }
}
