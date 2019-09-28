package com.consion.classloader;
 class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    public static int counter1 = 0;
    public static int counter2;
    private Singleton(){
        counter1++;
        counter2++;
    }

    public Singleton getInstance() {
        return INSTANCE;
    }
}

class A_Singleton {

}
