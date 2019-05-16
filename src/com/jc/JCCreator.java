package com.jc;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class JCCreator {

    public static void createFile(final String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
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
