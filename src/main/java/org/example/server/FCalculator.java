package org.example.server;

public class FCalculator {

    public long calculateRecursively(long userInput) {
        if (userInput == 0 || userInput < 0) {
            return 0;
        } else if (userInput == 1) {
            return 1;
        } else {
            return calculateRecursively(userInput - 1) + calculateRecursively(userInput - 2);
        }
    }

    public long calculateGeneralWay(long userInput) {
        long firstValue = 0;
        long secondValue = 1;
        if (userInput == firstValue || userInput < 0) {
            return 0;
        } else if (userInput == secondValue) {
            return 1;
        } else {
            for (int i = 2; i <= userInput; ++i) {
                long nextValue = firstValue + secondValue;
                firstValue = secondValue;
                secondValue = nextValue;
            }
            return secondValue;
        }
    }
}
