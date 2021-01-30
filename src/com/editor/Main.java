/*
 * Main.java
 * 29.01.2021
 * GH: odegovs
 */

package com.editor;

import java.io.File;
import java.io.IOException;

public class Main {

    public static String location;
    public static File path;
    public static int option;

    public static void main(String[] args) throws IOException {
        try {
            location = args[0];
            path = new File(location);
            option = Integer.parseInt(args[1]);
        } catch(Exception e) {
            System.out.println("Input runtime parameters");
        } finally {
            Text.open();
            Option.check();
        }
    }
}
