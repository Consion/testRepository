package com.consion.designpartten.适配器模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Consion
 * @create 2020-04-28 13:22
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("userName", "这个员工叫做混世魔王");
        map.put("mobileNumber", "这个员工电话是...");
        return map;
    }

    @Override
    public Map getUserOfficeInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("officeNumber", "这个员工办公电话是...");
        map.put("jobPosition", "这个员工职位是...");
        return map;
    }

    @Override
    public Map getUserHomeInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("homeTel", "这个员工家庭电话是。。。");
        map.put("mobileNumber", "这个员工家庭地址是...");
        return map;
    }

    @Override
    public String getJobPosition() {
        return null;
    }
}
