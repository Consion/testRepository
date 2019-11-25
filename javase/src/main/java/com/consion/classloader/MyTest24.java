package com.consion.classloader;

/**
 * 当前类加载器
 * 每个类都会使用自己的类加载器（即加载自身的类加载器）来加载其他的类（指的是所依赖的类）
 * 如果ClassX引用了ClassY，那么ClassX的类加载器就会加载ClassY（前提是ClassY尚未被加载过）
 *
 * 线程上下文类加载器（Context ClassLoader）
 * 线程上下文类加载器是从JDK1.2开始引入的，类Thread中的getContextClassLoader()与setContextClassLoader(ClassLoader cl)
 * 分别用来获取和设置上下文类加载器。
 * 如果没有通过setContextClassLoader(ClassLoader cl)进行设置的话，线程将继承其父线程的上下文类加载器，
 * Java应用运行时的初始线程的上下文类加载器是系统类加载器，在线程运行的代码中可以通过该类加载器来加载类和资源
 *
 * 线程上下文类加载器的重要性：
 *
 * SPI(Service Provider Interface)
 * 父ClassLoader可以使用当前线程Thread.currentThread().getContextClassLoader()所指定的classLoader加载的类
 * 这就改变了父ClassLoader不能使用子ClassLoader或是其他没有直接父子关系的ClassLoader加载类的情况，即
 * 改变了双亲委托模型。
 * 线程上下文类加载器就是当前线程的Current ClassLoader
 * 在双亲委托模型下，类加载是由下至上的，即下面的类加载器会委托上层类加载器加载，但是对于SPI来说，有些接口时JAVA核心库提供的
 * 而Java核心库是由启动类加载器加载的，而这些接口的实现确来自不同的jar包（厂商提供），Java启动类加载器时不会加载其它来源的jar包
 * 这样传统的双亲委托模型就无法满足SPI的要求，而通过给当前线程设置上下文类加载器，就可以由设置的上下文类加载器来实现对于接口实现
 * 类的加载
 * JDBC是由根类加载器加载的，但是JDBC会调用具体的JDBC实现，如MYSQL，此时通过根类加载器去加载具体JDBC实现，但是根类加载无法加载，
 * 所以需要通过线程类加载器去加载。
 */
public class MyTest24 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader());//App ClassLoader
        System.out.println(Thread.class.getClassLoader());//null
    }
}
