package com.consion.designpartten.装饰器模式;

/**
 * @author Consion
 * @create 2020-04-26 12:48
 */
public class Father {
    public static void main(String[] args) {
     /*   SchoolReport sr = new FouthGradeSchoolReport();
        sr.report();
        sr.sign("老三");*/
        SchoolReport sr = new SugarFouthGradeSchoolReport();
        sr.report();
        sr.sign("老三");
    }
}
