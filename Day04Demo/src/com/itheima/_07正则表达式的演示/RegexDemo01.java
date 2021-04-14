package com.itheima._07正则表达式的演示;

/**
 * 正则表达式的作用：
 *      是一些特殊字符组成的校验规则，可以校验信息的正确性，校验邮箱是否合法
 *      电话、金额等
 *
 * 需求：演示不用和用正则表达式校验QQ号码的区别
 */
public class RegexDemo01 {
    public static void main(String[] args) {
        String num = "292516539";
        System.out.println(matchNum(num));
        System.out.println(matchNumRegex(num));
    }

    //用正则表达式校验QQ号码
    public static boolean matchNumRegex(String qq){
        return qq != null && qq.matches("\\d{4,}");
    }

    //不用正则表达式校验QQ号码
    public static boolean matchNum(String qq) {
        if (qq == null) {
            return false;
        }else {
            if (qq.length() >= 4) {
                boolean rs = true;

                for (int i = 0; i < qq.length(); i++) {
                    char c = qq.charAt(i);
                    if (c < '0' || c > '9') {
                        rs = false;
                        break;
                    }
                }
                return rs;
            } else {
                return false;
            }
        }
    }
}
