package com.itheima._07正则表达式的演示;

/**
 * 正则表达式深入使用
 *
 * 字符类：看视频
 *
 * 预定义字符类：看视频
 *
 * Greedy数量词:看视频
 */
public class RegexDemo02 {
    public static void main(String[] args) {
        //只能出现a、b、c，一次只能校验一个
        System.out.println("a".matches("[abc]"));
        System.out.println("y".matches("[abc]"));

        //不能出现a、b、c，一次只能校验一个
        System.out.println("a".matches("[^abc]"));
        System.out.println("y".matches("[^abc]"));

        System.out.println("a".matches("\\d"));//false
        System.out.println("3".matches("\\d"));//true
        System.out.println("333".matches("\\d"));//false
        System.out.println("z".matches("\\w"));//true
        System.out.println("21".matches("\\w"));//false
        System.out.println("你".matches("\\w"));//false
        //以上正则匹配只能校验单个字符

        //校验密码
        //必须是数字、字母、下划线 至少六位
        //  \w包括字母、数字、下划线 \d表示数字
        System.out.println("Yao1212_".matches("\\w{6,}"));//true
        System.out.println("Yao1212_好".matches("\\w{6,}"));//false

        //验证 必须是数字和字符，必须是四位
        System.out.println("abc4".matches("[a-zA-Z0-9]{4}"));//true
        System.out.println("AvcE".matches("[a-zA-Z0-9]{4}"));//true
        System.out.println("abc45".matches("[a-zA-Z0-9]{4}"));//false

    }
}
