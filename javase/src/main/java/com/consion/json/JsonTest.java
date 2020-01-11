package com.consion.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {
    public static void main(String[] args) {
        Person p1 = new Person(1, "张三");
        Person p2 = new Person(2, "里斯");
        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        //1.将VO对象转换成json字符串
        String p1JsonString = JSON.toJSONString(p1);
        System.out.println(p1JsonString);

        String p1JsonArray = JSON.toJSONString(list);
        System.out.println(p1JsonArray);
        //2.将json字符串转换成VO对象
        Person pJsonObj = JSON.parseObject(p1JsonString, Person.class);
        System.out.println(pJsonObj.getName());

        List<Person> pJsonArray = JSON.parseArray(p1JsonArray, Person.class);
        pJsonArray.forEach(System.out::println);

        //3.调用一个外围服务，对方接受指定的格式的Json字符串[{"id":1,"name":"张三"},{"id":2,"name":"里斯"}]
        //3.1 call service p1JsonArray 使用字符串的方式进行数据的传输，但是这个符串遵循JSON格式

        //4.自己构造一个JSON对象，避免因为类型过多，导致类膨胀
        JSONObject p3 = new JSONObject();
        JSONObject dept1 = new JSONObject();
        dept1.put("id", "销售部");
        p3.put("id", 1);
        p3.put("name", "张三");
        p3.put("dept", dept1);

        JSONObject p4 = new JSONObject();
        p4.put("id", 2);
        p4.put("name", "李四");

        List<JSONObject> list2 = new ArrayList<>();
        list2.add(p3);
        list2.add(p4);

        Map<String, Object> p6 = new HashMap<>();
        p6.put("id", 3432);
        p6.put("name", "李四66666");

        System.out.println(JSON.toJSONString(p6));





    }
}

class Person {
    private int id;
    private String name;

    public Person() {}

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}