package com.consion.designpartten.适配器模式;

import java.util.Map;

/**
 * @author Consion
 * @create 2020-04-28 13:21
 */
public interface IOuterUser {
    // 基本信息
    Map getUserBaseInfo();

    // 工作区域信息
    Map getUserOfficeInfo();

    // 用户的家庭信息
    Map getUserHomeInfo();
    String getJobPosition();
}
