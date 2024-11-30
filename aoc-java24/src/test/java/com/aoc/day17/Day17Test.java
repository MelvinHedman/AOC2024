package com.aoc.day17;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day17Test {
    @Test
    public void testSolvePart1() {
        Solver solver = new Solver();
        String testInput = "example input data";
        assertEquals(42, solver.solvePart1(testInput));  // Ã„ndra det fÃ¶rvÃ¤ntade resultatet
    }

    @Test
    public void testSolvePart2() {
        Solver solver = new Solver();
        String testInput = "example input data";
        assertEquals(84, solver.solvePart2(testInput));  // Ã„ndra det fÃ¶rvÃ¤ntade resultatet
    }
}
