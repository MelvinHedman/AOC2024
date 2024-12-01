package com.aoc.day01;

public class Solver {
    int[] leftList = new int[1000];
    int[] rightList = new int[1000];
    int rows = 0;
    public int solvePart1(String input) {
        int diff = 0;
        this.rows = setList(input); 

        for(int i = 0; i < rows; i++){
            diff += Math.abs(leftList[i]-rightList[i]); 
        }

        return diff;
    }

    public int solvePart2(String input) {
        int score = 0;
        for(int i = this.rows-1; i >= 0; i--){
            int howMany = 0;
            int rightIndex = 0;
            int leftValue = leftList[i];
            
            int rightValue = rightList[rightIndex];

            while(leftValue <= rightValue){
                if(leftValue == rightValue){
                    howMany++;
                }
                rightIndex++;
                rightValue = rightList[rightIndex];
            } 
            score += leftValue * howMany; 
        }
        return score;
    }

    int setList(String input){
        String[] line = input.split("\n");
        int counter = 0;
        for(String str : line){
            String[] splitNumbers = str.split("   ");
            leftList[counter] = Integer.valueOf(splitNumbers[0]);
            rightList[counter] = Integer.valueOf(splitNumbers[1]);
            counter++;
        }

        leftList = bubblesort(leftList);
        rightList = bubblesort(rightList);

        return line.length;
    }

    int[] bubblesort(int arr[]) { 
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
       return arr;
    }
}


