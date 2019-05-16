package com.jc;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class JCCreator {

    public static void createFile(final String fileName) {
        try {
            FileUtils.touch(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createDirectory(final String directoryName) {
        try {
            FileUtils.forceMkdir(new File(directoryName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
