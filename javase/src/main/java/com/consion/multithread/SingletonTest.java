package com.consion.multithread;

/**
 * DCL双端检锁不一定时线程安全
 * @author Consion
 * @create 2021-07-09 12:26
 */
public class SingletonTest {
    // 加入volatile关键字的目的是防止指令重排，因为instance = new SingletonTest();可被拆成3给步骤
    // 1. 分配内存 instance引用为空
    // 2. 初始化对象 instance引用为空
    // 3. 将引用指向分配的内存地址 instance引用不为空
    // 因为2和3没有依赖关系，所以可能被指令重排，如果重排序以后instance则不为空，可能返回的instance对象为未被初始化
    private static volatile SingletonTest instance;

    public static SingletonTest getInstance() {
        if (instance == null) {
            synchronized (SingletonTest.class) {
                if (instance == null) {
                    instance = new SingletonTest();
                }
            }
        }
        return instance;
    }
}
