package com.consion.designpartten.责任链模式.impove;

/**
 * @author Consion
 * @create 2020-04-21 13:02
 */
public class Women implements IWomen {

    private LevelEnum type;
    private String request;

    public Women(LevelEnum type, String request) {
        this.type = type;
        this.request = request;
    }

    public Women(LevelEnum type) {
        this.type = type;
    }


    @Override
    public LevelEnum getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
