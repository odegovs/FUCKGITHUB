/*
 * Main.java
 * 08.02.2021 UPD
 * GH: odegovs
 */

package com.editor;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String secondPath;

        if (args.length == 3) {
            secondPath = args[2];
        } else {
            secondPath = null;
        }

        if (secondPath != null && (new File(secondPath)).exists() && (new File(args[0]).exists())) {
            ActionPerformer.perform(Integer.parseInt(args[1]), args[0], secondPath);
        }
    }
}
