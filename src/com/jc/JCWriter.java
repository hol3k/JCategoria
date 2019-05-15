package com.jc;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class JCWriter {

    public static void writeLines(final String fileName, final Collection lines) {
        try {
            FileUtils.writeLines(new File(fileName), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeLines(final String fileName, final Collection lines, final boolean append) {
        try {
            FileUtils.writeLines(new File(fileName), lines, append);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeLines(final String fileName, final String encoding, final Collection lines) {
        try {
            FileUtils.writeLines(new File(fileName), encoding, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeLines(final String fileName, final String encoding, final Collection lines, final boolean append) {
        try {
            FileUtils.writeLines(new File(fileName), encoding, lines, append);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeLines(final String fileName, final Collection lines, final String lineEnding) {
        try {
            FileUtils.writeLines(new File(fileName), lines, lineEnding);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeLines(final String fileName, final Collection lines, final String lineEnding, final boolean append) {
        try {
            FileUtils.writeLines(new File(fileName), lines, lineEnding, append);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeLines(final String fileName, final String encoding, final Collection lines, final String lineEnding, final boolean append) {
        try {
            FileUtils.writeLines(new File(fileName), encoding, lines, lineEnding, append);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
