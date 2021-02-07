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
import java.util.List;
import java.util.Scanner;

public class FileProcessor {

    public static List<Integer>readFile(String path) {
        try {
            List<Integer> values = new ArrayList<>();

            File file = new File(path);
            Scanner sc = new Scanner(file);
            while (sc.hasNextInt()) {
                values.add(sc.nextInt());
            }

            return values;
        } catch (FileNotFoundException e) {
            //  TODO: run this code. Does output looks clear for the user?
            e.printStackTrace();
            return null;
        }
    }

    public static void writeFile(String path, List<Integer> values) throws IOException {
        File file = new File(path);
        FileWriter wr = new FileWriter(file);
        for (Integer value : values) {
            wr.write(value.toString() + System.lineSeparator());
        }
        wr.close();
    }
}

