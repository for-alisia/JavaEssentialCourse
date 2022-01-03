package com.company;


import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class ReadingFromFile {
    public static void main(String[] args) {
        try {
            loadFile("test.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void loadFile(String filename) throws IOException {
        // Create a path to the file
        Path file = FileSystems.getDefault().getPath("", filename);
        // Read file line by line
        List<String> lines = Files.readAllLines(file);
        // Loop through the lines
        for (String line : lines) {
            System.out.println(line);
        }
        // with lambda
        lines.forEach((str) -> System.out.println(str));
        // With method reference
        lines.forEach(System.out::println);
    }
}
