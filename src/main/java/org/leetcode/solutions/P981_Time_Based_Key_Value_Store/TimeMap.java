package org.leetcode.solutions.P981_Time_Based_Key_Value_Store;

import java.util.*;

public class TimeMap {

    List<Integer> timestamps;
    List<Pair> entries;

    public TimeMap() {
        timestamps = new ArrayList<>();
        entries = new ArrayList<>();
    }

    private class Pair {
        String key;
        String value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public void set(String key, String value, int timestamp) {
        timestamps.add(timestamp);
        entries.add(new Pair(key, value));
    }

    public String get(String key, int timestamp) {

        if (timestamps.get(0) > timestamp)
            return "";

        int index = -1;
        for (int i = 0; i < timestamps.size(); i++) {
            if (timestamps.get(timestamps.size() - 1 - i) <= timestamp) {
                index =  timestamps.size() - 1 - i;
                break;
            }
        }

        while ( index >= 0) {
            if ( entries.get(index).key.equals(key) )
                return entries.get(index).value;
            else index--;
        }

        return "";
    }
}
