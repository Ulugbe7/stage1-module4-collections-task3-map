package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        return calculateFunctionMap(sourceList).containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (Integer element : sourceList) {
            int value = 5 * element + 2;
            resultMap.put(element, value);
        }

        return resultMap;
    }
}
