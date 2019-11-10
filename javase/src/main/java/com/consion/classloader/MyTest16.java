package com.consion.classloader;


import java.io.*;

/**
 * loadClass里面会调用findClass方法，如果父加载器无法加载该类，则会调用findClass方法
 *  1.调用findLoadedClass
 *  2.如果没有被加载过，则调用父类加载器的loadCLass
 *  3.如果父类加载器无法加载，则调用该类的loadClass方法
 */
public class MyTest16 extends ClassLoader{

    private String classLoaderName;
    private static final String EXTENSION = ".class";

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public MyTest16(String classLoaderName) {
        super();//将系统类加载器最后父加载器
        this.classLoaderName = classLoaderName;
    }
    public MyTest16(String classLoaderName, ClassLoader parent) {
        super(parent);//显示指定类加载器作为父类
        this.classLoaderName = classLoaderName;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("MyTest16 findClass invoke");
       byte[] data = loadClassData(name);
        assert data != null;
        return defineClass(name, data, 0, data.length);
    }

    private byte[] loadClassData(String name) {
        InputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            out = new ByteArrayOutputStream();
            name = name.replace(".", File.separator);
            in = new FileInputStream(this.path + name + EXTENSION);
            int ch = 0;
            while ((ch = in.read()) != -1) {
                out.write(ch);
            }
            return out.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
    public static void test(ClassLoader classLoader) {
        Class<?> clazz = null;
        try {
            clazz = classLoader.loadClass("com.consion.classloader.MyTest1");
            assert clazz != null;
            System.out.println(clazz.getClassLoader());
            Object instance = clazz.newInstance();
            System.out.println(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        //根类/扩展/App类加载器都无法加载，因此又loader1f自己加载
        //loader1.setPath("D:\\codes\\testRepository\\javase\\target\\classes\\");
        loader1.setPath("C:\\Users\\86188\\Desktop\\");
        Class clazz = loader1.loadClass("com.consion.classloader.MyTest1");
        System.out.println(clazz.getClassLoader());
        System.out.println(clazz.hashCode());
        //将classe里面的MyTest1.class删除，则会从桌面加载，由于loader1和loader2没有父子关系，所以
        //不同类加载器可以对同一个类加载多次
        MyTest16 loader2 = new MyTest16("loader2", loader1);//loader1作为loader2的父类加载器
        loader2.setPath("C:\\Users\\86188\\Desktop\\");
        clazz = loader2.loadClass("com.consion.classloader.MyTest1");
        System.out.println(clazz.getClassLoader());
        System.out.println(clazz.hashCode());

        MyTest16 loader3 = new MyTest16("loader3");//loader1作为loader2的父类加载器
        loader3.setPath("C:\\Users\\86188\\Desktop\\");
        clazz = loader3.loadClass("com.consion.classloader.MyTest1");
        System.out.println(clazz.getClassLoader());
        System.out.println(clazz.hashCode());


    }
}
