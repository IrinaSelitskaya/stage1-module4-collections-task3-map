package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        if (!sentence.isEmpty()) {
            String sentenceInLowerCase = sentence.toLowerCase();
            String[] words = sentenceInLowerCase.split("\\W\\s?|\\s");
            List<String> wordList = new ArrayList<>(List.of(words));
            for (String word : wordList) {
                map.putIfAbsent(word, Collections.frequency(wordList, word));
            }
        }
        return map;
    }
}
