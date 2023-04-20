package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer>map=new HashMap<>();
        List<String>list=new ArrayList<>();
        for (Map.Entry<Integer,String>entry:sourceMap.entrySet()){
            Integer sourceMapKey=entry.getKey();
            String sourceMapValue= entry.getValue();
            if (!list.contains(sourceMapValue)){
                list.add(sourceMapValue);
                map.put(sourceMapValue,sourceMapKey);
            }else {
                Integer mapValue=map.get(sourceMapValue);
                if (mapValue>sourceMapKey){
                    map.putIfAbsent(sourceMapValue,sourceMapKey);
                }
            }
        }
        return map;
    }
}
