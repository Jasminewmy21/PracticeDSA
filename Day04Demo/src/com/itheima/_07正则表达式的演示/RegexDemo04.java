package com.itheima._07正则表达式的演示;

/**
 * 目标：正则表达式在方法中的应用
 *      public String[] split(String regex):
 *      --按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组
 *      public String replaceAll(String regex, String newStr)
 *      --按照正则表达式匹配的内容进行替换
 */
public class RegexDemo04 {
    public static void main(String[] args) {
        //1.split的基础用法
        String names = "KrisWu,Nicholas,Jason" ;

        //以”,“分割成字符串数组
        String[] nameArrs = names.split(",");
        for (int i = 0; i < nameArrs.length; i++) {
            String name = nameArrs[i];
            System.out.println(name);
        }
        System.out.println("-----------------");

        //2.split集合正则表达式做分割
        String names1 = "吴亦凡4323rfs见你1212lala想我" ;
        String[] nameArr01 = names1.split("\\w+");
        for (int i = 0; i < nameArr01.length; i++) {
            String name = nameArr01[i];
            System.out.println(name);
        }
        System.out.println("-----------------");

        //3.public String replaceAll(String regex, String newStr)
        String names2 = "吴亦凡4323rfs喜欢1212lala二瑶";
        System.out.println(names2.replaceAll("\\w+", ""));
    }
}
