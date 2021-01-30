/*
 * Text.java
 * 29.01.2021
 * GH: odegovs
 */

package com.editor;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Text {

    public static ArrayList<Integer> values = new ArrayList<>();
    public static Scanner sc = null;

    public static void open() {
        try {
            sc = new Scanner(Main.path);
            while(sc.hasNextInt()) {
                values.add(sc.nextInt());
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void write() throws IOException {
        FileWriter wr = new FileWriter(Main.path);
        for(int i = 0; i < values.size(); i++) {
            wr.write(values.get(i).toString() + System.lineSeparator());
        }
        wr.close();
    }
}
