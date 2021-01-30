/*
 * Main.java
 * 29.01.2021
 * GH: odegovs
 */

package com.editor;

import java.io.File;
import java.io.IOException;

public class Main {

    //  TODO: why you need this GLOBAL variable?
    public static String location;
    //  TODO: why such name?
    public static File path;
    public static int option;

    //  TODO: idea gives you some advice on this line
    public static void main(String[] args) throws IOException {
        try {
            location = args[0];
            path = new File(location);
            option = Integer.parseInt(args[1]);
            Text.open();
            Option.check();
        //  TODO: some issue with formatting
        } catch(Exception e) {
            //  TODO: Users runs ur program and see such a message. What does it tell him?
            //  It's something like if you entered wrong password and system gives you a message: "Password"
            System.out.println("Input runtime parameters");
        }
    }
}
