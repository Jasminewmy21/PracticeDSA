package com.itheima._07正则表达式的演示;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 拓展：正则表达式爬取信息中的内容
 */
public class RegexDemo05 {
    public static void main(String[] args) {
        String rs = "手机号码18903984833"+
                "邮箱292516539@qq.com";

        //需求：从rs爬取号码，邮箱
        //1.定义爬取规则
//        String regex = "(\\w+@\\w{2,10}(\\.\\w{2,10}){1,2}) | (1[3-9]\\d{9}) | (0\\d{2,5}-?\\d{3,10})";
        String regex = "(1[3-9]\\d{9}) | (\\w+@\\w{2,10}(\\.\\w{2,10}){1,2})";//这里有问题，爬不出来又有邮箱又有电话，单个可以

        //2.编译正则表达式成为一个【匹配规则对象】
        Pattern pattern = Pattern.compile(regex);

        //3.通过【匹配规则对象】得到一个【匹配数据内容】的匹配器对象
        Matcher matcher = pattern.matcher(rs) ;

        //4.通过匹配器去内容中爬取出信息
        while(true) {
            if (!matcher.find()) break;
            System.out.println(matcher.group());
        }
    }
}
