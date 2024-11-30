package com.aoc.day16;

public class Day16 {
    public static void main(String[] args) {
        String input = Input.read("day16.txt");
        Solver solver = new Solver();
        System.out.println("LÃ¶sning del 1: " + solver.solvePart1(input));
        System.out.println("LÃ¶sning del 2: " + solver.solvePart2(input));
    }
}
