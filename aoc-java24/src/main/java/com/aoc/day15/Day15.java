package com.aoc.day15;

public class Day15 {
    public static void main(String[] args) {
        String input = Input.read("day15.txt");
        Solver solver = new Solver();
        System.out.println("LÃ¶sning del 1: " + solver.solvePart1(input));
        System.out.println("LÃ¶sning del 2: " + solver.solvePart2(input));
    }
}
