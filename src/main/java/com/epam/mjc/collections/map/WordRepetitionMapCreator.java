package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        if (sentence.isEmpty()) {
            return wordCountMap;
        }
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        return wordCountMap;
    }
}
