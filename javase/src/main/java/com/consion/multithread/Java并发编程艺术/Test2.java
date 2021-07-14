package com.consion.multithread.Java并发编程艺术;

/**
 * 减少上下文切换实践
 * 1.用jstack命令查看目前jvm中的线程情况（jstatic 31177 > /home/tengfei.fangtf/dump17）
 * 2.统计所有线程分别处于什么状态，发现300个线程处于waiting状态（grep java.lang.Thread.State dump17 | awk 'print $2$3$4$5'）
 * 3.打开dump文件发现这些线程基本上全是JBOSS线程在await，说明JBOSS线程池里线程接受到的任务太少都闲着
 * 4.修改配置文件，将maxThreads调整为100
 * 5.重启JBOSS再次统计，则减少了175个
 */
public class Test2 {
}
