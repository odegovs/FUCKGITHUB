/*
 * Option.java
 * 29.01.2021
 * GH: odegovs
 */

package com.editor;

import java.io.IOException;

public class Option {

    public static void check() throws IOException {
        switch (Main.option) {
            case 1 -> Math.sum();
            case 2 -> Math.multiply();
            default -> System.out.println("Invalid runtime argument [1]");
        }
    }
}
