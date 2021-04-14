package com.itheima._06包装类的使用;

/**
 * 具体的特殊功能有：
 *      1。可以把基本数据类型的值转换成字符串类型的值(没啥用)
 *          --调用toString方法
 *          --调用Integer。toString(基本数据类型的值)得到字符串
 *          --直接把基本数据类型+空字符串就得到了字符串
 *      2.把字符串类型的数值转换成对应的基本数据类型的值(有用)
 *          --Xxx.parseXxx("字符串类型的数值")
 *          --Xxx.valueof("字符串类型的数值")：推荐使用
 */
public class PackageClass02 {
    public static void main(String[] args) {
        //1.可以把基本数据类型的值转换成字符串类型的值(没啥用)
        Integer it = 100;

        String itStr = it.toString();
        System.out.println( itStr + 1);

        String itStr1 = Integer.toString(it);
        System.out.println(itStr1 + 1);

        //但上述就很蠢，直接把基本数据类型+空字符串就得到字符串了
        String itStr2 = it+"";
        System.out.println(itStr2);
        System.out.println(("-------------------"));

        //2.把[字符串类型的数值]转换成对应的基本数据类型的值(有用)
        String numStr = "21";
//        int num = Integer.parseInt(numStr);
//        System.out.println(num+1);
        int numInt = Integer.valueOf(numStr);//比上面的好，不管啥类型都是valueof
        System.out.println(numInt);

        String numDbStr = "222.22";
        double numD = Double.parseDouble(numDbStr);
        System.out.println(numD+0.01);
        double numDb = Double.valueOf(numDbStr);
        System.out.println(numDb+0.01);


    }

}
