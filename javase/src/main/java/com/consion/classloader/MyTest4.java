package com.consion.classloader;

/**
 * 对于数组实例来说，其类型是由jvm在运行期间动态生成的表示为：class [Lcom.consion.classloader.MyParent4;
 * 这种形式 ，动态生成的类型，其父类为Object
 *
 * 对于数组磊说，JavaDoc经常将构成数组的元素称之为Component，实际上，就是将数组降低一个维度的类型
 * [Lcom.consion.classloader.MyParent4;，降低一个维度类型为Lcom.consion.classloader.MyParent4
 * [[Lcom.consion.classloader.MyParent4;，降低一个维度类型为[Lcom.consion.classloader.MyParent4;
 *
 *关键助记符：
 * anewarray：表示创建一个引用类型的（如类 ，接口，数组）数组，并将其引用之压入栈顶
 * newarray;表示创建一个指定的原始类型的(int,float，char)类型的数组，并将其引用之压入栈顶
 */
public class MyTest4 {
    public static void main(String[] args) {
        //MyParent4 myParent4 = new MyParent4();//对MyParent4的（首次）主动使用，会导致该类的初始化
        //System.out.println("=====");
        //MyParent4 myParent44 = new MyParent4();//非主动使用，不会导致对该类的初始化
        MyParent4[] arr = new MyParent4[5];
        //数组从属类型，运行期生成的数组类型new MyParent4[5]，类似于动态代理
        System.out.println(arr.getClass());//class [Lcom.consion.classloader.MyParent4;

        MyParent4[][] arr2 = new MyParent4[5][];//一维数组：[Lxxx，二维数组：[[Lxxx
        System.out.println(arr2.getClass());

        System.out.println("=====");
        int[] intarr = new int[2];
        System.out.println(intarr.getClass());//class [I
        System.out.println(intarr.getClass().getSuperclass());//class java.lang.Object
        //使用javap来查看字节码中的数组类型的助记符

        char[] chara = new char[2];
        System.out.println(chara.getClass());
   }
}
class MyParent4 {
    static {
        System.out.println("MyParent4 static block.");
    }
}