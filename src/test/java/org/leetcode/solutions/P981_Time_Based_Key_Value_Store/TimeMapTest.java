package org.leetcode.solutions.P981_Time_Based_Key_Value_Store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class TimeMapTest {

    private TimeMap timeMap;

    @BeforeEach
    void setTimeMap() {
        timeMap = new TimeMap();
    }

    @Test
    public void setAndGet() {
        //given
        String key = "testKey";
        String value = "testValue";
        int time = 5;

        //when
        timeMap.set("testKey", "testValue", time);

        //then
        Assertions.assertEquals("testValue", timeMap.get("testKey", 5));
    }

    @Test
    public void setAndGetPrevious() {
        //given
        String key = "testKey";
        String value = "testValue";
        int time = 5;

        //when
        timeMap.set("testKey", "testValue", time);

        //then
        Assertions.assertEquals("testValue", timeMap.get("testKey", time + 5));
    }

    @Test
    public void setAndGetSomethingThatNotExistInAnyTime() {
        //given
        String key = "testKey";
        String value = "testValue";
        int time = 5;

        //when
        timeMap.set("testKey", "testValue", time);

        //then
        Assertions.assertEquals("", timeMap.get("testKeyNotExist", time + 5));
    }

    @Test
    public void setAndGetSomethingThatExistInFutureShouldReturnEmpty() {
        //given
        String key = "testKey";
        String value = "testValue";
        int time = 5;

        //when
        timeMap.set("testKey", "testValue", time);

        //then
        Assertions.assertEquals("", timeMap.get("testKeyNotExist", time - 2));
    }

}