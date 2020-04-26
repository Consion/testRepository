package com.consion.designpartten.责任链模式;

/**
 * @author Consion
 * @create 2020-04-21 13:02
 */
public class Women implements IWomen {

    private int type = 0;
    private String request;

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    public Women(int nextInt) {
        this.type = nextInt;
    }


    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
