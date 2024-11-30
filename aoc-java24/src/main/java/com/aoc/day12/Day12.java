package com.aoc.day12;

public class Day12 {
    public static void main(String[] args) {
        String input = Input.read("day12.txt");
        Solver solver = new Solver();
        System.out.println("LÃ¶sning del 1: " + solver.solvePart1(input));
        System.out.println("LÃ¶sning del 2: " + solver.solvePart2(input));
    }
}
