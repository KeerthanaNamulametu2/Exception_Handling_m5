package com.company;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Example of UncheckedIOException
 *
 */
public class Clip03
{
    public static void main( String[] args ) throws IOException
    {
        processFile("C:\\Users\\keerthana_careeco\\Downloads\\java-fundamentals-exception-handling\\05-working-with-exceptions\\working-with-exceptions-exercise-files\\m4\\file.txt");
    }

    private static void processFile(String path) throws IOException {
        Files.lines(Paths.get(path))
                .forEach(line -> processData(line));
    }

    private static void processData(String l) {
        try {
            throw new IOException();
        } catch (IOException ioe) {
            throw new UncheckedIOException(ioe);
        }
    }
}
