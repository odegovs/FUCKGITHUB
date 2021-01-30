/*
 * Math.java
 * 29.01.2021
 * GH: odegovs
 */

package com.editor;

import java.io.IOException;

public class Math {

    public static void sum() {
        int result = 0;
        for(int i = 0; i < Text.values.size(); i++) {
            result += Text.values.get(i);
        }
        System.out.println("Sum of numbers in the file is: " + result);
    }

    public static void multiply() throws IOException {
        for (int i = 0; i < Text.values.size(); i++) {
            Text.values.set(i, Text.values.get(i) * 2);
        }
        Text.write();
    }
}
