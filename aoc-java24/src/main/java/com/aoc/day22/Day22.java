package com.aoc.day22;

public class Day22 {
    public static void main(String[] args) {
        String input = Input.read("day22.txt");
        Solver solver = new Solver();
        System.out.println("LÃ¶sning del 1: " + solver.solvePart1(input));
        System.out.println("LÃ¶sning del 2: " + solver.solvePart2(input));
    }
}
