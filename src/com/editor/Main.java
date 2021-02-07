/*
 * Main.java
 * 03.02.2021 UPD
 * GH: odegovs
 */

package com.editor;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            String filePath = args[0];
            int actionType = Integer.parseInt(args[1]);

            ActionPerformer.perform(actionType, filePath);
        //  TODO: read about exceptions; google: java exceptions
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
