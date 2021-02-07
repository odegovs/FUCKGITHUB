/*
 * Math.java
 * 03.02.2021 UPD
 * GH: odegovs
 */

package com.editor;

import java.io.IOException;
import java.util.List;

public class Math {

    public static int sum(List<Integer> values) {
        int result = 0;

        //  TODO: for-each
        for(int i = 0; i < values.size(); i++) {
            result += values.get(i);
        }
        return result;
    }

    public static void multiply() throws IOException {
        for (int i = 0; i < FileProcessor.values.size(); i++) {
            FileProcessor.values.set(i, FileProcessor.values.get(i) * 2);
        }
    }
}
