package com.denmats.java2;

import java.io.IOException;

public class Contestant2 implements Runnable{

    private final Calculations calc;
    private final int[][] sorted2DArray;
    private final Bubble bubble;

    public Contestant2(Calculations calc){
        this.calc = calc;
        this.sorted2DArray = new int[calc.getRow()][calc.getCol()];
        this.bubble = new Bubble();
    }

    public void startThread2(Calculations calc) throws IOException {
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
            startThread2(calc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void parallelSorting2(){
        for (int i = 1; i < 2; i++) {
            for (int j = 16/2+1; j < 16; j++) {
                int[] sorted1DArray = calc.getCopiedArray()[i].clone();
                sorted1DArray = bubble.b_sort(sorted1DArray);
                this.sorted2DArray[i] = sorted1DArray;
            }
        }
    }

    public Thread mergeSortParallel2(){

        return new Thread(){
            @Override
            public void run(){
                parallelSorting2();
            }
        };
    }
}
