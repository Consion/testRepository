package com.consion.designpartten.适配器模式;

/**
 * @author Consion
 * @create 2020-04-28 13:15
 */
public interface IUserInfo {
    // 获得用户姓名
    String getUsername();
    // 获取家庭地址
    String getHomeAddress();
    // 手机号码
    String getMobileNumber();
    // 办公电话
    String getOfficeTelNumber();
    // 职位
    String getJobPosition();
}
