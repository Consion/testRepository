package com.consion.bytecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

/**
 * 对于Java类中的每一个实例方法，其在其在编译后所生成的字节码当中，方法参数的数量总是比源代码中的方法
 * 参数的数量多一个，（this）,它位于方法的第一个参数位置；这样，我们就可以在Java的实例方法中使用this来去访问
 * 当前对象的属性以及其它方法。
 * 这个操作是在编译期间完成的，即由java编译器在编译的时候将对this的访问转化成对一个普通的实例方法的参数的访问，
 * 接下来在运行期间由JVM在调用实例方法时，自动向实例方法传入this参数，所以在实例方法的局部变量表中，
 * 至少会有一个指向当前对象的局部变量
 *
 * Java字节码对于异常的处理方式
 * 1. 统一采用异常表的方式进行处理
 * 2.在jdk1.2之前的版本中，并不是使用异常表的方式来对异常进行处理的，而是采用特定指令方式。
 * 3.当异常处理存在finally语句块时，现代化的JVM采取的处理方式时将finally语句块的字节码拼接到每一个catch块的后面，
 * 换句话说，程序中存在多少个catch块就会在每一个catch块后面重复多少个finally语句块的字节码，原因：减少跳转的次数，从而提高
 * 程序的执行性能？
 *
 */
public class MyTest3 {
    public void test() throws IOException, FileNotFoundException{
        try {
            InputStream is = new FileInputStream("text.txt");
            ServerSocket serverSocket = new ServerSocket(9999);
            serverSocket.accept();
        }catch (FileNotFoundException ex) {

        }catch (IOException ex) {

        }catch (Exception ex) {

        }finally {
            System.out.println("Finally");
        }
    }
}
