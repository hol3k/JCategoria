package com.jc;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class JCMover {

    public static void moveDirectory(final String sourceDirectory, final String targetDirectory) {
        moveDirectory(new File(sourceDirectory), new File(targetDirectory));
    }

    public static void moveDirectory(final File sourceDirectory, final File targetDirectory) {
        try {
            FileUtils.moveDirectory(sourceDirectory, targetDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void moveDirectoryToDirectory(final String sourceDirectory, final String targetDirectory, final boolean createDestinationDirectory) {
        moveDirectoryToDirectory(new File(sourceDirectory), new File(targetDirectory), createDestinationDirectory);
    }

    public static void moveDirectoryToDirectory(final File sourceDirectory, final File targetDirectory, final boolean createDestinationDirectory) {
        try {
            FileUtils.moveDirectoryToDirectory(sourceDirectory, targetDirectory, createDestinationDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void moveFile(final String sourceFilePath, final String destinationFilePath) {
        moveFile(new File(sourceFilePath), new File(destinationFilePath));
    }

    public static void moveFile(final File sourceFile, final File destinationFile) {
        try {
            FileUtils.moveFile(sourceFile, destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void moveFileToDirectory(final String sourceFilePath, final String destinationFilePath, final boolean createDestinationFile) {
        moveFileToDirectory(new File(sourceFilePath), new File(destinationFilePath), createDestinationFile);
    }

    public static void moveFileToDirectory(final File sourceFile, final File destinationFile, final boolean createDestinationFile) {
        try {
            FileUtils.moveFileToDirectory(sourceFile, destinationFile, createDestinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void moveToDirectory(final String sourceDirectoryPath, final String destinationDirectoryPath, final boolean createDestinationDirectory) {
        moveToDirectory(new File(sourceDirectoryPath), new File(destinationDirectoryPath), createDestinationDirectory);
    }

    public static void moveToDirectory(final File sourceDirectory, final File destinationDirectory, final boolean createDestinationDirectory) {
        try {
            FileUtils.moveToDirectory(sourceDirectory, destinationDirectory, createDestinationDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
