package com.bassplayer.ai;

import org.junit.Test;

public class CompareTest {
    /**
     *
     */
    @Test
    public void testCompare(){
        Compare cp = new Compare();
        String str1 = "Hello";
        String str2 = "Hello";
        cp.distance(str1,str2);
    }
}
