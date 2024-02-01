package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        var newMap = new HashMap<String, Integer>();
        for (Integer i : sourceMap.keySet()) {
            newMap.put(sourceMap.get(i), i);
        }

        return newMap;
    }
}
