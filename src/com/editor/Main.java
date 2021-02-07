/*
 * Main.java
 * 03.02.2021 UPD
 * GH: odegovs
 */

package com.editor;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            TextEditor.argsLocation = args[0];
            ActionPerformer.actionType = Integer.parseInt(args[1]);
            TextEditor.openFile();
            ActionPerformer.checkActionType();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
