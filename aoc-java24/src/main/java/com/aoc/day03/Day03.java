package com.aoc.day03;

public class Day03 {
    public static void main(String[] args) {
        String input = Input.read("day03.txt");
        Solver solver = new Solver();
        System.out.println("LÃ¶sning del 1: " + solver.solvePart1(input));
        System.out.println("LÃ¶sning del 2: " + solver.solvePart2(input));
    }
}
