package com.consion.designpartten.装饰器模式.impove;

/**
 * @author Consion
 * @create 2020-04-26 12:44
 */
public class FouthGradeSchoolReport implements SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的xx家长：");
        System.out.println("...");
        System.out.println("语文62，数学65，体育98， 自然63");
        System.out.println("...");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名：" + name);
    }
}
