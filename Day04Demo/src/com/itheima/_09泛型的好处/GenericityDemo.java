package com.itheima._09泛型的好处;

import java.util.ArrayList;

/**
 * 泛型在编译阶段约束了操作的数据类型，从而不会出现类型转换异常
 * 体现的是Java的严谨性和规范性，数据类型经常需要进行统一
 */
public class GenericityDemo {
    public static void main(String[] args) {
        ArrayList lists = new ArrayList();
        lists.add("赵敏");
        lists.add("赵敏");
        lists.add("赵敏");
        lists.add("赵敏");
    }
}
