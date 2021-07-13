package com.consion.multithread;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Consion
 * @create 2021-07-09 12:47
 */
public class AtomicReferenceDemo {

    public static void main(String[] args) {
        User zs = new User("zs", "22");
        User ls = new User("ls", "22");
        AtomicReference<User> userAtomicReference = new AtomicReference<>(zs);
        System.out.println(userAtomicReference.compareAndSet(zs, ls));
        System.out.println(userAtomicReference.compareAndSet(zs, ls));
    }
}
class User {
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
