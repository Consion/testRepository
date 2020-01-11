package com.consion.bytecode;

import java.util.Date;

/** 虚方法表中的每一个方法都被描述出一个方法的调用入口地址，该地址在真正执行时所调用的，如果子类没有重写父类的方法，
 * 子类中的虚方法表就会直接指向父类的该方法，如果覆写了父类方法，那么对于相同描述符方法无论是子类还是父类，
 * 如果方法的描述符是相同的，那么该方法在子类和父类的索引都是相同的。
 * 针对于方法调用动态分配的过程，虚拟机会在类的方法区建立一个虚方法表的数据结构（virtual method table, vtable）,
 * 在类的链接阶段产生，
 *
 *
 * 针对于invokeinterface指令来说，虚拟机会建立一个叫做接口方法表的数据结构（interface method table, itable）3
 */
public class MyTest7 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.test("str");
        dog.test(new Date());
    }
}

class Animal {
    public void test(String str) {
        System.out.println("animal str");
    }

    public void test(Date date) {
        System.out.println("animal Date");
    }
}

class Dog extends Animal {
    public void test(String str) {
        System.out.println("Dog str");
    }

    public void test(Date date) {
        System.out.println("Dog Date");
    }
}