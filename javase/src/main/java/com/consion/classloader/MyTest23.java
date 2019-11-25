package com.consion.classloader;

/**
 * 在运行期，一个java类是由该类的完全限定名（binary name，二进制名）和用于加载该类的定义类加载器（defining loader）所共同决定的
 *  如果同样名字，（即完全限定名相同）的类s是由两个不同的类加载器所加载，那么这些类就不同，即使.class类字节码完全相同，且从相同
 *  位置加载亦如此。
 *
 *  在oracle的HotSpot虚拟机中，系统属性sun.boot.class.path如果修改错了，则运行会出错，提示如下信息：
 *  Error occurred during initialization of VM
 *  java/lang/NoClassDefFoundError: java/lang/Object
 */
public class MyTest23 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));//启动类加载器加载的目录
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
        /**
         * ext和app类加载器都是由java代码所编写的，那么它们是由谁去加载的呢？
         * 内建于JVM的启动类加载器会加载java.lang.ClassLoader以及其他java平台类
         * 当JVM启动时，一块特殊的机器码会被执行，它会加载扩展类加载器和应用类加载器
         * 这块特殊的机器码就是启动类加载器（Bootstrap）
         * 启动类并不是Java类，由C++编写，启动类加载器是特定于平台的机器指令，它负责开启整个类加载过程
         * 扩展类加载器和应用类加载器也是由启动类加载的，可以查看Launcher类
         */
    }
}
