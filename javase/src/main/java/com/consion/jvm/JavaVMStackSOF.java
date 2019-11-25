package com.consion.jvm;

/**
 * 单线程条件下，如下代码均无法出现OutOfMemoryError异常，只会出现StackOverflowError异常
 * 通过-Xss参数来减少栈内存容量
 * 定义大量本地变量，增大方法栈帧本地变量表的长度。
 */
public class JavaVMStackSOF {
    private int stackLength = 1;
    public void stackLeak() {
        stackLength++;
        stackLeak();

    }

    public static void main(String[] args) {
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        } catch (Throwable ex) {
            System.out.println("Stack Length:" + javaVMStackSOF.stackLength);
            throw ex;
        }
    }
}
