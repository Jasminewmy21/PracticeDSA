package com.itheima._04System系统类的使用;

import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * System代表当前系统
 * 静态方法：
 *      1.public static void exit(int status)：终止当前运行的Java虚拟机，非0是异常终止
 *      2.public static long currentTimeMillis()：返回当前时间（以毫秒为单位）
 *      3.可以做数组的拷贝
 *       *arraycopy(Object src, int srcPos,Object dest,int destPos,int length)
 *       *参数一：原数组
 *       *参数二：从原数组的哪个位置开始赋值
 *       *参数三：目标数组
 *       *参数四：赋值到目标数组的哪个位置
 *       *参数五：赋值几个
 */
public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始");

        //1.终止当前虚拟机
        //System.exit(0);//0是正常终止

        //2.得到当前时间毫秒值
        long time = System.currentTimeMillis();
        System.out.println(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(time));

        //3.可以做数组的拷贝(了解。并不这么用)
        int[] arrs1 = new int[]{10,20,30,40,50,60,70};
        int[] arrs2 = new int[6];//{0,0,0,0,0,0}

        //目标：arrs2 = {0,30,40,50,0,0}
        /**
         *public static native void arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length);
         */
        System.arraycopy(arrs1,2,arrs2,1,3);
        System.out.println(Arrays.toString(arrs2));

        System.out.println("程序结束");
    }
}
