package com.denmats.java2;

import java.io.IOException;

//public class ContestantTEST implements Runnable {
//
//    private int[][] copied2DArray;
//    private int[][] sorted2DArray;
//    private int[] sorted1DArray;
//    private int row;
//    private int col;
//    Bubble bubble;
//    Keeper keeper;
//    Calculations calc;
//
//    public ContestantTEST(int row, int col) throws IOException {
//        this.row = row;
//        this.col = col;
//        this.copied2DArray = new int[this.row][this.col];
//        this.bubble = new Bubble();
//        keeper = new Keeper("data.txt");
//        calc = new Calculations(this.row, this.col);
//        keeper.readFromFile();
//        makeACopyOf2DArray(calc);
//        this.sorted1DArray = new int[this.row];
//        this.sorted2DArray = new int[this.row][this.col];
//    }
//
//    @Override
//    public void run() {
//        for (int j = 0; j < 2; j++) {
//            this.sorted1DArray = this.bubble.b_sort(this.copied2DArray[j]);
//            this.sorted2DArray[j] = this.sorted1DArray;
//        }
//    }
//
//    public void makeACopyOf2DArray(Calculations calc) {
//        for (int i = 0; i < calc.getRow(); i++) {
//            for (int j = 0; j < calc.getCol(); j++) {
//                copied2DArray[i][j] = calc.getRandomArray()[i][j];
//            }
//        }
//    }
//
//
//    public void parallelSorting82() {
//        for (int j = 2 + 1; j < 4; j++) {
//            this.sorted1DArray = this.bubble.b_sort(this.copied2DArray[j]);
//            this.sorted2DArray[j] = this.sorted1DArray;
//        }
//    }
//
//    public Thread mergeSortParallel82() {
//        return new Thread() {
//            @Override
//            public void run() {
//                parallelSorting82();
//            }
//        };
//    }
//
//    public void parallelSorting83() {
//        for (int j = 4 + 1; j < 6; j++) {
//            this.sorted1DArray = this.bubble.b_sort(this.copied2DArray[j]);
//            this.sorted2DArray[j] = this.sorted1DArray;
//        }
//    }
//
//    public Thread mergeSortParallel83() {
//        return new Thread() {
//            @Override
//            public void run() {
//                parallelSorting83();
//            }
//        };
//    }
//
//    public void parallelSorting84() {
//        for (int j = 6 + 1; j < 8; j++) {
//            this.sorted1DArray = this.bubble.b_sort(this.copied2DArray[j]);
//            this.sorted2DArray[j] = this.sorted1DArray;
//        }
//    }
//
//    public Thread mergeSortParallel84() {
//        return new Thread() {
//            @Override
//            public void run() {
//                parallelSorting84();
//            }
//        };
//    }
//
//    public void parallelSorting85() {
//        for (int j = 8 + 1; j < 10; j++) {
//            this.sorted1DArray = this.bubble.b_sort(this.copied2DArray[j]);
//            this.sorted2DArray[j] = this.sorted1DArray;
//        }
//    }
//
//    public Thread mergeSortParallel85() {
//        return new Thread() {
//            @Override
//            public void run() {
//                parallelSorting85();
//            }
//        };
//    }
//
//    public void parallelSorting86() {
//        for (int j = 10 + 1; j < 12; j++) {
//            this.sorted1DArray = this.bubble.b_sort(this.copied2DArray[j]);
//            this.sorted2DArray[j] = this.sorted1DArray;
//        }
//    }
//
//    public Thread mergeSortParallel86() {
//        return new Thread() {
//            @Override
//            public void run() {
//                parallelSorting86();
//            }
//        };
//    }
//
//    public void parallelSorting87() {
//        for (int j = 12 + 1; j < 14; j++) {
//            this.sorted1DArray = this.bubble.b_sort(this.copied2DArray[j]);
//            this.sorted2DArray[j] = this.sorted1DArray;
//        }
//    }
//
//    public Thread mergeSortParallel87() {
//        return new Thread() {
//            @Override
//            public void run() {
//                parallelSorting87();
//            }
//        };
//    }
//
//    public void parallelSorting88() {
//        for (int j = 14 + 1; j < 16; j++) {
//            this.sorted1DArray = this.bubble.b_sort(this.copied2DArray[j]);
//            this.sorted2DArray[j] = this.sorted1DArray;
//        }
//    }
//
//    public Thread mergeSortParallel88() {
//        return new Thread() {
//            @Override
//            public void run() {
//                parallelSorting88();
//            }
//        };
//    }
//}

