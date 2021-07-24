package com.denmats.java2;

import java.io.IOException;
import java.util.Arrays;

public class Contestant {


    private final int[][] sorted2DArray;
    private final Bubble bubble;


    public Contestant(Calculations calc) throws IOException {
        this.bubble = new Bubble();
        this.sorted2DArray = new int[calc.getRow()][calc.getCol()];
    }

    public void run(Calculations calc) {
        for (int i = 0; i < calc.getRow(); i++) {
            int[] sorted1DArray = calc.getCopiedArray()[i].clone();
            sorted1DArray = bubble.b_sort(sorted1DArray);
            this.sorted2DArray[i] = sorted1DArray;
        }

    }

    public int[][] getSorted2DArray() {
        return sorted2DArray;
    }
}
