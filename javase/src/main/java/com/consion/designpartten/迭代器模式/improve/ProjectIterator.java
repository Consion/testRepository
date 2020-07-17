package com.consion.designpartten.迭代器模式.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Consion
 * @create 2020-05-11 13:17
 */
public class ProjectIterator implements IProjectIterator {
    private List<IProject> projectList = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        return currentItem < projectList.size() && this.projectList.get(currentItem) != null;
    }

    @Override
    public IProject next() {
        return this.projectList.get(currentItem++);
    }
}
