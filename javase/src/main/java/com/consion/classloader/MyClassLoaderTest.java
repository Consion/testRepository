package com.consion.classloader;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyClassLoaderTest {
    public static void main(String[] args) {
        MyClassLoader loader1 = new MyClassLoader("loader1");
        loader1.setRootPath("D:\\codes\\zytest\\classloadertest\\classloader\\serverlib\\");
        //loadClassAndInstance(loader1);
        MyClassLoader loader2 = new MyClassLoader(loader1, "loader2");
        loader2.setRootPath("D:\\codes\\zytest\\classloadertest\\classloader\\clientlib\\");
        loadClassAndInstance(loader2);
        MyClassLoader loader3 = new MyClassLoader(null, "loader3");
        loader3.setRootPath("D:\\codes\\zytest\\classloadertest\\classloader\\otherlib\\");
        //loadClassAndInstance(loader3);

    }

    public static void loadClassAndInstance(MyClassLoader loader) {
        try {
            //如果使用loadClass方法加载类，则遵循双亲委托模式，loadClass会调用findClass方法类记载类
            //如果使用findClass方法加载类，则不遵循双亲委托模式
            Class<?> clazz = loader.loadClass("classloader.Sample");
            System.out.println(clazz.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}


 class MyClassLoader extends ClassLoader {
    //类加载器的名字
    private String classLoaderName;
    //加载的类文件根目录
    private String rootPath;
    //类文件扩展名
    private static final String EXTENTION_NAME = ".class";

    //super()默认会将系统类加载器设置为当前类加载器的父类加载器
    public MyClassLoader(String classLoaderName){
        super();
        this.classLoaderName = classLoaderName;
    }


    public MyClassLoader(ClassLoader parent, String classLoaderName) {
        super(parent);
        this.classLoaderName = classLoaderName;
    }

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classData = loadClassData(name);
        if (classData == null) {
            throw new ClassNotFoundException(String.format("%s没有被加载到！", name));
        }
        return defineClass(name, classData, 0, classData.length);
    }

    private byte[] loadClassData(String name) {
        InputStream inputStream;
        ByteArrayOutputStream outputStream;
        name = name.replace(".", File.separator);
        try {
            inputStream = new FileInputStream(new File(rootPath + name + EXTENTION_NAME));
            outputStream = new ByteArrayOutputStream();
            int ch = -1;
            while ((ch = inputStream.read()) != -1) {
                outputStream.write(ch);
            }
            return outputStream.toByteArray();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String getClassLoaderName() {
        return classLoaderName;
    }

    public void setClassLoaderName(String classLoaderName) {
        this.classLoaderName = classLoaderName;
    }

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }
}
