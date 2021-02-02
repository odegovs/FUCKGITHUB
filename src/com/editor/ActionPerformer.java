/*
 * ActionPerformer.java
 * 03.02.2021 UPD
 * GH: odegovs
 */

package com.editor;

import java.io.IOException;

public class ActionPerformer {

    public static int actionType;

    public static void checkActionType() throws IOException {
        switch (actionType) {
            case 1 -> Math.sum();
            case 2 -> Math.multiply();
            default -> System.out.println("Invalid runtime argument [1]");
        }
    }
}
