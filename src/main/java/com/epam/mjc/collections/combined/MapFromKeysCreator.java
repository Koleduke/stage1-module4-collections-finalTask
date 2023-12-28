package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (Map.Entry<String, Integer> e : sourceMap.entrySet())
            if(map.containsKey(e.getKey().length())){
                map.get(e.getKey().length()).add(e.getKey());
            }else {
                map.put(e.getKey().length(), new HashSet<>(Collections.singleton(e.getKey())));
            }
        return map;
    }
}
