package com.consion.classloader;

/**
 * 线程上下文类加载器的一般使用模式（获取-使用-还原）
 * ClassLoader classLoader = Thread.currentThread().getContextClassLoader();//获取当前线程上下文类加载器-（获取）
 * try {
 *     Thread.currentThread().setContextClassLoader(targetTccl);//targetTccl:目标类加载器
 *     myMethod();（使用）
 * } finally {
 *     Thread.currentThread().setContextClassLoader(classLoader)//使用完毕后一定要（还原）
 * }
 *
 * myMethod里面调用了Thread.currentThread().getContextClassLoader();来获取当前线程上下文类加载器做某些事情
 * 如果一个类由类加载器A加载，那么这个类的依赖类也是由相同的类加载器加载的（如果依赖类没有被加载过的话）
 *
 *
 * 以下重要！！！
 * ContextClassLoader作用就是破坏Java类加载的委托机制。
 *当高层提供了统一的接口让低层实现，同时又要在高层加载（或者实例化）低层类时，就必须要通过线程上下文类加载器来帮助高层的
 * ClassLoader找到并加载该类。
 */
public class MyTest26 {
    public static void main(String[] args) {

    }
}
