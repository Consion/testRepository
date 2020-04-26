package com.consion.designpartten.责任链模式.impove;

/**
 * @author Consion
 * @create 2020-04-21 13:00
 */
public interface IWomen {
    // 状态：已婚，未婚，丧夫
    LevelEnum getType();
    String getRequest();
}
