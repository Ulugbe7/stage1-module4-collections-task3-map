package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KeyValueSwapper {
    /*public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        var newMap = new HashMap<String, Integer>();
        for (Integer i : sourceMap.keySet()) {
            newMap.put(sourceMap.get(i), i);
        }

        return newMap;
    } */
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String, Integer> swappedMap = new TreeMap<>(); // TreeMap to automatically order keys

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            // If the value is already present in the swappedMap, check for a smaller key
            if (swappedMap.containsKey(value)) {
                Integer existingKey = swappedMap.get(value);
                if (key < existingKey) {
                    swappedMap.put(value, key);
                }
            } else {
                // If the value is not present, simply add the key-value pair
                swappedMap.put(value, key);
            }
        }

        return swappedMap;
    }
}
