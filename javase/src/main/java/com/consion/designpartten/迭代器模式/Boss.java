package com.consion.designpartten.迭代器模式;

import com.consion.designpartten.迭代器模式.improve.IProject;
import com.consion.designpartten.迭代器模式.improve.Project;

import java.util.ArrayList;

/**
 * @author Consion
 * @create 2020-05-03 9:31
 */
public class Boss {
    public static void main(String[] args) {
        ArrayList<IProject> projectList = new ArrayList<>();
        projectList.add(new Project("星球大战项目", 10, 100000));
        projectList.add(new Project("扭转时空项目", 100, 10000000));
        projectList.add(new Project("超人改造项目", 1000, 1000000000));
        for (int i = 4; i < 104; i++) {
            projectList.add(new Project("第" + i + "个项目", i * 5, i * 1000000));
        }
        for (IProject project : projectList) {
            System.out.println(project.getProjectInfo());
        }
    }
}
