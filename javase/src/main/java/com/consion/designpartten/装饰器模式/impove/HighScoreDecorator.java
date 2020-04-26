package com.consion.designpartten.装饰器模式.impove;

/**
 * @author Consion
 * @create 2020-04-26 12:57
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportHighScore() {
        System.out.println("语文75，数学78，体育98， 自然80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        sr.report();
    }
}
