/*
 * Math.java
 * 08.02.2021 UPD
 * GH: odegovs
 */

package com.editor;

import java.io.IOException;
import java.util.List;

public class Math {

    public static int sum(List <Integer> values) {
        int result = 0;

        for (Integer i : values) {
            result += i;
        }
        return result;
    }

    public static void multiply(List <Integer> values, String path) throws IOException {
        for (int i = 0; i < values.size(); i++) {
            values.set(i, values.get(i) * 2);
        }
        FileProcessor.updateFile(values, path);
    }
}
