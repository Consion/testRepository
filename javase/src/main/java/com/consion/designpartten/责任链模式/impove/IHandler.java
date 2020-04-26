package com.consion.designpartten.责任链模式.impove;


/**
 * @author Consion
 * @create 2020-04-24 13:29
 */
public abstract class IHandler {
    private IHandler next;
    private LevelEnum handleLevel;

    public IHandler(LevelEnum handleLevel) {
        this.handleLevel = handleLevel;
    }

    public final void handleMessage(IWomen women) {
        if (women.getType() == handleLevel) {
            this.response(women);
        } else if (next != null){
            next.handleMessage(women);
        } else {
            System.out.println("到头了");
        }
    }

    protected abstract void response(IWomen women);

    public void setNext(IHandler next) {
        this.next = next;
    }
}

