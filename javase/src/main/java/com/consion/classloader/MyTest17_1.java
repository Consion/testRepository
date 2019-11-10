package com.consion.classloader;

/**
 * 操作1：将path改为桌面，且将MySample.class和MyCat.class拷贝到桌面，同时删除classes文件夹中的2个类文件
 * 结果1：2个类都通过MyTest16加载。
 * 原因1：loader1会委托给父类App加载，App会委托给Ext加载，Ext会委托给Bootstrap加载，Bootstrap/Ext/App均无法加载，则又loader1加载
 *
 * 操作2：删除掉MyCat.class，桌面既有MySample又有MySample
 * 结果2：MyCat无法被正确加载
 * 原因2：MySample类是由应用类加载器加载的，然后由应用类加载器会尝试加载MySample锁依赖的MyCat，Bootstrap/Ext/App均无法加载，导致报错
 *
 * 操作3：删除掉MySample.class，桌面既有MySample又有MySample
 * 结果3：正常执行
 * 原因3：jvm提供的类加载器均无法加载上面的2个类，所以又自定义的loader1类加载器加载
 * 只要加载类，就会委托父类加载
 *
 * 操作4：在MyCat.java中的构造方法中添加代码System.out.println("from MyCat:" + MySample.class);
 * 结果4：正常输出
 * 原因4：-
 *
 * 操作4：继续步骤4，删除掉MySample.class，在桌面这2个类都有
 * 结果4：报错
 * 原因4：MySample是由自定义类加载器loader1加载，而MyCat是由应用类加载器加载，在MyCat中无法访问MySample，
 *        因为这2个类不在同一个命名空间中
 *
 * 命名空间总结：自定义类加载器loader1的父类加载器是App，此时，loader1可以访问由App类加载器加载的类，而App无法访问
 * 由loader1类加载器加载的类
 *
 */
public class MyTest17_1 {
    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\Users\\86188\\Desktop\\");
        Class<?> clazz = loader1.loadClass("com.consion.classloader.MySample");
        System.out.println(clazz.getClassLoader());
        System.out.println(clazz.hashCode());

        //如果注释掉改行，M将不会实例化ySample对象，即MySample构造方法不会被调用
        //因此不会实例化MyCat类，即没有对MyCat进行主动使用。
        Object instance = clazz.newInstance();
      //  System.out.println(instance);
    }
}
