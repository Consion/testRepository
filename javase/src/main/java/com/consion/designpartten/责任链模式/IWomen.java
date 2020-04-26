package com.consion.designpartten.责任链模式;

/**
 * @author Consion
 * @create 2020-04-21 13:00
 */
public interface IWomen {
    // 状态：已婚，未婚，丧夫
    int getType();
    String getRequest();
}
