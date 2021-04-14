package com.itheima._03异常_编译时异常;

/**
 * 编译时异常:
 *      继承自Exception的异常或者其子类,但不是RuntimeException
 *      编译时异常编译阶段遇到,必须处理,否则代码编译不通过
 *
 * 作用:
 *      是担心程序员的技术不行,在编译阶段就爆出一个错误,目的在于提醒
 *      提醒程序员这里很可能出错,请检查并注意不要出bug
 *
 *      编译时异常是可遇不可求的,遇到了就遇到了
 *
 * 小结:
 *      编译时异常编译阶段就会报错,继承了Exception
 */
public class ExceptionDemo {
}
