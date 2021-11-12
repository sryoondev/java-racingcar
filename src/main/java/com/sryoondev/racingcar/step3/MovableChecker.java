package com.sryoondev.racingcar.step3;

import java.util.Random;

public class MovableChecker {
    private static final int UPPER_BOUND = 10;
    private static final int MOVABLE_THRESHOLD = 4;

    private final Random random;

    public MovableChecker() {
        this.random = new Random();
    }

    public boolean isMovable() {
        return random.nextInt(UPPER_BOUND) > MOVABLE_THRESHOLD;
    }
}