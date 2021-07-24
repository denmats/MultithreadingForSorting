package com.denmats.java2;

import java.io.IOException;

public class Contestant16 implements Runnable {

    private final Calculations calc;
    private final int[][] sorted2DArray;
    private final Bubble bubble;

    public Contestant16(Calculations calc) {
        this.calc = calc;
        this.sorted2DArray = new int[calc.getRow()][calc.getCol()];
        this.bubble = new Bubble();
    }

    public void startThread16(Calculations calc) throws IOException {
        for (int i = 0; i < calc.getRow(); i++) {
            int[] sorted1DArray = calc.getCopiedArray()[i].clone();
            sorted1DArray = bubble.b_sort(sorted1DArray);
            this.sorted2DArray[i] = sorted1DArray;
        }

    }

    public int[][] getSorted2DArray() {
        return sorted2DArray;
    }

    @Override
    public void run() {
        try {
            startThread16(calc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

