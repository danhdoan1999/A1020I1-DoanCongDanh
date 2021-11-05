package bai12_java_collection_framework.thuc_hanh.su_dung_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        // hashmap sap xep khong theo thu tu nao
        Map<String , Integer> hashMap = new HashMap<>();
        hashMap.put("Danh",21);
        hashMap.put("Cuong",22);
        hashMap.put("Hieu",16);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);
        // treemap sap xep theo alphabet , 1,2,3 ...
        Map<String , Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in TreeMap");
        System.out.println(treeMap);
        // linkedhashmap sap xep theo trat tu duoc truyen vao
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("An",27);
        linkedHashMap.put("Tien",23);
        linkedHashMap.put("Hung",11);
        System.out.println("Display entries in LinkedHashMap");
        System.out.println(linkedHashMap);
        System.out.println("Tuoi cua Tien la " + linkedHashMap.get("Tien"));
    }
}
