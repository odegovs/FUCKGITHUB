/*
 * Math.java
 * 08.02.2021 UPD
 * GH: odegovs
 */

package com.editor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListActions {


    public static List <Integer> convertListToInteger(List <String> values) throws IOException {
        List <Integer> valuesInteger = new ArrayList<>();

        for (String i : values) {
            valuesInteger.add(Integer.parseInt(i));
        }

        return valuesInteger;
    }

    public static int sum(List <Integer> values) {
        int result = 0;

        for (Integer i : values) {
            result += i;
        }
        return result;
    }

    public static void multiply(List <Integer> values, String path) throws IOException {
        for (int i = 0; i < values.size(); i++) {
            values.set(i, values.get(i) * 2);
        }
        FileProcessor.updateFile(values, path);
    }

    public static List <Integer> returnEvenIndexes(List <Integer> values) {
        List <Integer> indexes = new ArrayList <>();
        for (Integer i : values) {
            if (i % 2 == 0) {
                indexes.add(values.indexOf(i));
            }
        }
        return indexes;
    }

    public static void removeLines(List <String> values, List <Integer> indexes, String secondPath) throws IOException {
        for (int i = 0; i < values.size(); i++) {
            for (int y = 0; i < values.size(); i++) {
                if (values.indexOf(i) == indexes.indexOf(y)) {
                    values.remove(i);
                }
            }
        }

        FileWriter wr = new FileWriter(secondPath);
        for (String value : values) {
            wr.write(value.toString() + System.lineSeparator());
        }
        wr.close();
    }
}
