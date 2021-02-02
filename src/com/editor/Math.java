/*
 * Math.java
 * 03.02.2021 UPD
 * GH: odegovs
 */

package com.editor;

import java.io.IOException;

public class Math {

    public static void sum() {
        int result = 0;
        for(int i = 0; i < TextEditor.values.size(); i++) {
            result += TextEditor.values.get(i);
        }
        System.out.println("Sum of numbers in the file is: " + result);
    }

    public static void multiply() throws IOException {
        for (int i = 0; i < TextEditor.values.size(); i++) {
            TextEditor.values.set(i, TextEditor.values.get(i) * 2);
        }
        TextEditor.writeFile();
    }
}
