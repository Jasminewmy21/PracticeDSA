package com.itheima._05Collections工具类;

import java.util.*;

/**
 * 字符串按照首字符的编号升序排序
 *
 * 自定义类型的比较方法API：
 *      public static <T> void sort(List<T> list) 将集合中元素按照默认规则排序
 *          将集合中元素按照默认规则排序
 *          对于自定义的引用类型的排序人家不知道怎么排，直接报错
 *          如果希望自定义的引用类型排序不报错，可以给类提供比较规则：实现接口Comparable
 *
 *      public static <T> void sort(List<T> list, Comparator<? super T> c)
 *          将集合中元素按照制定规则排序，自带比较器
 *          注意：如果类有比较规则，而这里有比较器，优先使用比较器
 */
public class CollectionsDemo02 {
    public static void main(String[] args) {
        //为Orange类写比较器
        List<Orange> oranges = new ArrayList<>();
        Orange o1 = new Orange("红橘子","1.11",250);
        Orange o2 = new Orange("黄橘子","2.11",200);
        Orange o3 = new Orange("绿橘子","4.11",300);
        Orange o4 = new Orange("蓝橘子","3.11",260);
        Collections.addAll(oranges,o1,o2,o3,o4);
        Collections.sort(oranges);
        System.out.println(oranges);

        //为集合写比较器
        List<Orange> oranges01 = new ArrayList<>();
        Orange o11 = new Orange("红橘子","1.11",250);
        Orange o22 = new Orange("黄橘子","2.11",100);
        Orange o33 = new Orange("绿橘子","4.11",200);
        Collections.addAll(oranges01,o1,o2,o3);
        Collections.sort(oranges01, new Comparator<Orange>() {
            @Override
            public int compare(Orange o1, Orange o2) {
                if(o1.getWeight() > o2.getWeight()) return -1;
                if(o1.getWeight() < o2.getWeight()) return 1;
                return 0;
            }
        });
        System.out.println(oranges01);
    }
}
