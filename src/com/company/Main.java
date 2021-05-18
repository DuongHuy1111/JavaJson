package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        JSONObject object = new JSONObject();
        object.put("name", "Huy");
        object.put("age", new Integer(28));
        object.put("salary", new Double(1200));
        System.out.print(object.toJSONString());

        // Mã hóa JSON bằng ĐT Map
        Map obj = new HashMap();
        obj.put("name", "Huy");
        obj.put("age", new Integer(28));
        obj.put("salary", new Double(1200));
        String jsonText = JSONValue.toJSONString(obj);
        System.out.print("\n" + jsonText);

        // Mã hóa JSON Array trong java
        JSONArray array = new JSONArray();
        array.add("Huy");
        array.add(new Integer(27));
        array.add(new Double(1200));
        System.out.println("\n" + array);

        // Giải mã chuỗi JSON
        String jsonStr = "{\"name\":\"Vinh\",\"salary\":1200.0,\"age\":27}";
        Object o = JSONValue.parse(jsonStr);
        JSONObject jsonObject = (JSONObject) o;

        String name = (String) jsonObject.get("name");
        double salary = (double) jsonObject.get("salary");
        long age = (long) jsonObject.get("age");
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
        System.out.println("name: " + age);
    }
}
