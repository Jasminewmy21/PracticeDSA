package com.itheima._11包和权限修饰符;

/**
 * 目标：权限修饰符
 *
 * 四种：private，缺省，protected,public
 * 可以修饰成员变量，方法，构造器，内部类
 * 不同修饰符修饰的成员能够被访问的权限将受到限制
 *
 *                  private     缺省      protected       public
 * 本类中              √          √            √             √
 * 本包下其他类                    √            √             √
 * 其他包下的子类中                              √             √
 * 其他包下的类中                                              √
 *
 */
public class Modifier {

}
