package com.denmats.java2;

import java.io.IOException;

public class Contestant4 implements Runnable {

    private final Calculations calc;
    private final int[][] sorted2DArray;
    private final Bubble bubble;

    public Contestant4(Calculations calc) {
        this.calc = calc;
        this.sorted2DArray = new int[calc.getRow()][calc.getCol()];
        this.bubble = new Bubble();
    }

    public void startThread4(Calculations calc) throws IOException {
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
            startThread4(calc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



//    public void parallelSorting42() {
//        for (int j = 4 + 1; j < 8; j++) {
//            this.sorted1DArray = this.bubble.b_sort(this.copied2DArray[j]);
//            this.sorted2DArray[j] = this.sorted1DArray;
//        }
//        for (int i = 1; i < 2; i++) {
//            for (int j = 16/2+1; j < 16; j++) {
//                int[] sorted1DArray = calc.getCopiedArray()[i].clone();
//                sorted1DArray = bubble.b_sort(sorted1DArray);
//                this.sorted2DArray[i] = sorted1DArray;
//            }
//        }
//    }

//    public Thread mergeSortParallel42() {
//        return new Thread() {
//            @Override
//            public void run() {
//                parallelSorting42();
//            }
//        };
//    }
//}
//
//    public void parallelSorting43() {
//        for (int j = 8 + 1; j < 12; j++) {
//            this.sorted1DArray = this.bubble.b_sort(this.copied2DArray[j]);
//            this.sorted2DArray[j] = this.sorted1DArray;
//        }
//    }
//
//    public Thread mergeSortParallel43() {
//        return new Thread() {
//            @Override
//            public void run() {
//                parallelSorting43();
//            }
//        };
//    }
//
//    public void parallelSorting44() {
//        for (int j = 12 + 1; j < 16; j++) {
//            this.sorted1DArray = this.bubble.b_sort(this.copied2DArray[j]);
//            this.sorted2DArray[j] = this.sorted1DArray;
//        }
//    }
//
//    public Thread mergeSortParallel44() {
//        return new Thread() {
//            @Override
//            public void run() {
//                parallelSorting44();
//            }
//        };
//    }
//}
//
