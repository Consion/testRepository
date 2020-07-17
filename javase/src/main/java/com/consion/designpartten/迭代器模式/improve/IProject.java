package com.consion.designpartten.迭代器模式.improve;

/**
 * @author Consion
 * @create 2020-05-03 9:08
 */
public interface IProject {
    void add(String name, int num, int cost);
    // 从老板这里看到的就是项目信息
    String getProjectInfo();

    //获得迭代器
   IProjectIterator iterator();
}
