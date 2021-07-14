package com.consion;

import com.alibaba.fastjson.util.IOUtils;

import java.io.File;
import java.nio.file.Files;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        File file = new File("D:\\BaiduNetdiskDownload\\0879-1300");
//        for (File listFile : file.listFiles()) {
//            System.out.println(listFile.getName());
//        }
        File first = file.listFiles()[0];
        System.out.println(file.listFiles().length);
    }
}
