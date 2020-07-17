package com.consion.designpartten.迭代器模式.improve;

import java.util.ArrayList;

/**
 * @author Consion
 * @create 2020-05-03 9:10
 */
public class Project implements IProject {
    private String name;
    private int num;
    private int cost;
    private ArrayList<IProject> projectList = new ArrayList<>();
    public Project() {}
    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        info +="项目名称是：" + this.name;
        info +="\t 项目人数是：" + this.num;
        info += "\t 项目费用" + this.cost;
        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
