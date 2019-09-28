package com.consion.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
//
//public class MyClassLoader extends ClassLoader {
//    //类加载器的名字
//    private String classLoaderName;
//    //加载的类文件根目录
//    private String rootPath;
//    //类文件扩展名
//    private static final String EXTENTION_NAME = ".class";
//
//    //super()默认会将系统类加载器设置为当前类加载器的父类加载器
//    public MyClassLoader(String classLoaderName){
//        super();
//        this.classLoaderName = classLoaderName;
//    }
//
//
//    public MyClassLoader(ClassLoader parent, String classLoaderName) {
//        super(parent);
//        this.classLoaderName = classLoaderName;
//    }
//
//    @Override
//    public Class<?> findClass(String name) throws ClassNotFoundException {
//        byte[] classData = loadClassData(name);
//        if (classData == null) {
//            throw new ClassNotFoundException(String.format("%s没有被加载到！", name));
//        }
//        return defineClass(name, classData, 0, classData.length);
//    }
//
//    private byte[] loadClassData(String name) {
//        InputStream inputStream;
//        ByteArrayOutputStream outputStream;
//        name = name.replace(".", File.separator);
//        try {
//            inputStream = new FileInputStream(new File(rootPath + name + EXTENTION_NAME));
//            outputStream = new ByteArrayOutputStream();
//            int ch = -1;
//            while ((ch = inputStream.read()) != -1) {
//                outputStream.write(ch);
//            }
//            return outputStream.toByteArray();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }
//
//    public String getClassLoaderName() {
//        return classLoaderName;
//    }
//
//    public void setClassLoaderName(String classLoaderName) {
//        this.classLoaderName = classLoaderName;
//    }
//
//    public String getRootPath() {
//        return rootPath;
//    }
//
//    public void setRootPath(String rootPath) {
//        this.rootPath = rootPath;
//    }
//}
