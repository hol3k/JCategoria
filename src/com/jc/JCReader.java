package com.jc;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JCReader {

    public static String readFileToString(final String fileName, final String encoding) {
        String fileData = "";
        try {
            fileData = FileUtils.readFileToString(new File(fileName), encoding);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileData;
    }

    public static List<String> readFile(final String fileName, final String encoding) {
        List <String> fileDataList = new ArrayList<>();
        try {
            fileDataList = FileUtils.readLines(new File(fileName), encoding);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileDataList;
    }

    public static byte[] readFileToByteArray(final String fileName) {
        byte[] byteArrayToReturn = null;
        try {
            byteArrayToReturn = FileUtils.readFileToByteArray(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return byteArrayToReturn;
    }

}
