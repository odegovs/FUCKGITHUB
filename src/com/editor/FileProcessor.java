/*
 * FileProcessor.java
 * 08.02.2021 UPD
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

    public static List <Integer> readFile(String path) throws FileNotFoundException {
        List <Integer> values = new ArrayList <>();
        Scanner sc = new Scanner(new File(path));

        while (sc.hasNextInt()) {
            values.add(sc.nextInt());
        }

        return values;
    }

    public static void updateFile(List <Integer> values, String path) throws IOException {
        FileWriter wr = new FileWriter(path);

        for (Integer value : values) {
            wr.write(value.toString() + System.lineSeparator());
        }
        wr.close();
    }
}

