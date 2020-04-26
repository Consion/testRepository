package com.consion.designpartten.装饰器模式.impove;

/**
 * @author Consion
 * @create 2020-04-26 12:55
 */
public abstract class Decorator implements SchoolReport {
    protected SchoolReport sr;
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        sr.report();
    }

    @Override
    public void sign(String name) {
        sr.sign(name);
    }
}
