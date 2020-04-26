package com.consion.designpartten.装饰器模式.impove;

/**
 * @author Consion
 * @create 2020-04-26 12:55
 */
public class Client {
    public static void main(String[] args) {
        SchoolReport sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);


        SchoolReport schoolReport = new SortDecorator(new HighScoreDecorator(new FouthGradeSchoolReport()));
        schoolReport.report();
        schoolReport.sign("老八");
    }
}
