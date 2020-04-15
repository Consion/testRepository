package com.consion.designpartten.原型模式;

/**
 * @author Consion
 * @create 2020-04-09 20:40
 */
public class AdvTemplate {
    //广告信名称
    private String advSubject = "XX银行国庆信用卡抽奖活动";

    //广告信内容
    private String advContext = "国庆抽奖通知：只要刷卡就送你100w";

    public String getAdvSubject() {
        return advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }
}
