package com.consion.classloader;

/**
 * java -Djava.ext.dirs=./ com.consion.classloader.MyTest22
 * 将扩展类加载器的目录更改为当前目录，还是由应用类加载器加载的
 * 原因是扩展类加载器不会加载.class文件，只会加载jar包
 * jar -cvf test.jar com/consion/classloader/MyTest1.class
 * 如果将./换成/尝试从根目录下加载，则会加载不到，还会由应用类加载器加载。
 */
public class MyTest22 {
    static {
        System.out.println("MyTest22 init...");
    }
    public static void main(String[] args) {
        System.out.println(MyTest22.class.getClassLoader());
        System.out.println(MyTest1.class.getClassLoader());
    }
}
