package com.itheima._09自定义异常;

/**
 * 异常都有一个类
 * 但是项目里每一种异常sun公司不可能都写了类,所以要自定义异常
 *
 * 需求:年龄<0 or >100是一个异常
 *
 * 自定义异常:
 *      1.自定义编译时异常
 *          a.定义一个异常类继承Exception
 *          b.重写构造器
 *          c.在出现异常的地方用throw new自定义对象抛出
 *          编译时异常是编译阶段就报错,提醒更加强烈,一定要处理
 *      2.自定义运行时异常
 *          a.定义一个异常类继承RuntimeException
 *          b.重写构造器
 *          c.在出现异常的地方用throw new自定义对象抛出
 *          提醒不强烈,编译阶段不报错
 *
 * 小结:
 *      是程序员自己定义的异常
 *      继承Exception/RuntimeException
 *      重写构造器
 *      在出现异常的地方用throw new 自定义异常对象抛出
 */
public class ExceptionDemo {
    //2.自定义运行时异常
//    public static void main(String[] args) {
//            checkAge(200);
//    }
//
//    private static void checkAge(int age) {
//        if(age < 0 || age > 100){
//            //出现异常了
//            //throws:用在方法上,用于抛出方法中的异常
//            //throw:用在出现异常的地方,用于创建异常对象且立即从此处抛出
//            throw new AgeIllegalRuntimeException("/年龄不合法");
//        }else{
//            System.out.println("Age=" + age);
//        }
//    }

    public static void main(String[] args) {
        try {
            checkAge(200);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }
    }

    //1.自定义编译时异常
    private static void checkAge(int age) throws AgeIllegalException {
        if(age < 0 || age > 100){
            //出现异常了
            //throws:用在方法上,用于抛出方法中的异常
            //throw:用在出现异常的地方,用于创建异常对象且立即从此处抛出
            throw new AgeIllegalException("/年龄不合法");
        }else{
            System.out.println("Age=" + age);
        }
    }
}
