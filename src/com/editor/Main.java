/*
 * Main.java
 * 08.02.2021 UPD
 * GH: odegovs
 */

package com.editor;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        if (new File(args[0]).exists()) {
            try {
                ActionPerformer.perform(Integer.parseInt(args[1]), args[0]);
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Error: File is not exists");
        }
    }
}
