package com.consion.designpartten.装饰器模式;

/**
 * @author Consion
 * @create 2020-04-26 12:50
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    private void reportHighScore() {
        System.out.println("语文75，数学78，体育98， 自然80");
    }
    private void reportSort() {
        System.out.println("我的排名使第38名");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
