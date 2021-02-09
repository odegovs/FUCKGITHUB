/*
 * ActionPerformer.java
 * 08.02.2021 UPD
 * GH: odegovs
 */

package com.editor;

import java.io.IOException;

public class ActionPerformer {

    public static void perform(int actionType, String path) throws IOException {
        switch (actionType) {
            case 1 -> System.out.println("Values sum is: " + Math.sum(FileProcessor.readFile(path)));
            case 2 -> Math.multiply(FileProcessor.readFile(path), path);
            default -> System.out.println("ActionType is invalid");
        }
    }
}