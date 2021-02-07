/*
 * ActionPerformer.java
 * 03.02.2021 UPD
 * GH: odegovs
 */

package com.editor;

import java.io.IOException;
import java.util.List;

public class ActionPerformer {

    public static void perform(int actionType, String filePath) throws IOException {
        switch (actionType) {
            case 1 -> sum(filePath);
            case 2 -> multiply(filePath);
            default -> System.out.println("Invalid runtime argument [1]");
        }
    }

    private static void sum(String filePath) {
        List<Integer> values = FileProcessor.readFile(filePath);
        int sum = Math.sum(values);

        System.out.println("Sum of numbers in the file is: " + sum);
    }

    private static void multiply(String filePath) throws IOException {
        FileProcessor.readFile(filePath);
        Math.multiply();
        FileProcessor.writeFile(filePath);
    }
}
