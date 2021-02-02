/*
 * TextEditor.java
 * 03.02.2021 UPD
 * GH: odegovs
 */

package com.editor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextEditor {

    public static ArrayList <Integer> values = new ArrayList <>();
    public static String argsLocation;
    public static File fileLocation;

    public static void openFile() {
        try {
            Scanner sc = new Scanner(fileLocation);
            while (sc.hasNextInt()) {
                values.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() throws IOException {
        FileWriter wr = new FileWriter(fileLocation);
        for (Integer value : values) {
            wr.write(value.toString() + System.lineSeparator());
        }
        wr.close();
    }
}

