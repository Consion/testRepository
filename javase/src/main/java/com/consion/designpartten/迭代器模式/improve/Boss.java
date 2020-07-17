package com.consion.designpartten.迭代器模式.improve;

/**
 * @author Consion
 * @create 2020-05-03 9:31
 */
public class Boss {
    public static void main(String[] args) {
        IProject project = new Project();
        project.add("星球大战项目", 10, 100000);
        project.add("扭转时空项目", 100, 10000000);
        project.add("超人改造项目", 1000, 1000000000);

        for (int i = 4; i < 104; i++) {
            project.add("第" + i + "个项目", i * 5, i * 1000000);
        }
        IProjectIterator iterator = project.iterator();
        for (;iterator.hasNext();) {
            IProject next = iterator.next();
            System.out.println(next.getProjectInfo());
        }



    }
}
