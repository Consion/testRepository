package com.consion.designpartten.适配器模式;

import java.util.Map;

/**
 * @author Consion
 * @create 2020-04-29 13:05
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUsername() {
        return (String) baseInfo.get("userName");
    }

    @Override
    public String getHomeAddress() {
        return (String) homeInfo.get("homeTel");
    }

    @Override
    public String getMobileNumber() {
        return (String) homeInfo.get("mobileNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        return (String) officeInfo.get("officeNumber");
    }

    @Override
    public String getJobPosition() {
        return null;
    }
}
