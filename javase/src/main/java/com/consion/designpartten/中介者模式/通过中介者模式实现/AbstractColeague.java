package com.consion.designpartten.中介者模式.通过中介者模式实现;


public abstract class AbstractColeague {
    protected AbstractMediator abstractMediator;

    public AbstractColeague(AbstractMediator abstractMediator) {
        this.abstractMediator = abstractMediator;
    }
}
