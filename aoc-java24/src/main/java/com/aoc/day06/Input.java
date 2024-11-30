package com.aoc.day06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class Input {
    public static String read(String filename) {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(Input.class.getResourceAsStream("/" + filename), StandardCharsets.UTF_8))) {
            return reader.lines().collect(Collectors.joining("\n"));
        } catch (Exception e) {
            throw new RuntimeException("Error reading input file", e);
        }
    }
}
