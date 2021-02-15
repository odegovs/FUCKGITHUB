/*
 * ActionPerformer.java
 * 08.02.2021 UPD
 * GH: odegovs
 */

package com.editor;

import java.io.IOException;

public class ActionPerformer {

    public static void perform(int actionType, String path, String secondPath) throws IOException {
        switch (actionType) {
            case 1 -> System.out.println("Values sum is: " + ListActions.sum(ListActions.convertListToInteger(FileProcessor.readFile(path))));
            case 2 -> ListActions.multiply(ListActions.convertListToInteger(FileProcessor.readFile(path)), path);
            case 3 -> ListActions.removeLines(FileProcessor.readFile(secondPath),
                      ListActions.returnEvenIndexes(ListActions.convertListToInteger(FileProcessor.readFile(path))), secondPath);
            default -> System.out.println("ActionType is invalid");
        }
    }
}