package com.denmats.java2;

import java.io.IOException;

public class Contestant8 implements Runnable {

    private final Calculations calc;
    private final int[][] sorted2DArray;
    private final Bubble bubble;

    public Contestant8(Calculations calc) {
        this.calc = calc;
        this.sorted2DArray = new int[calc.getRow()][calc.getCol()];
        this.bubble = new Bubble();
    }

    public void startThread8(Calculations calc) throws IOException {
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
            startThread8(calc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//    public void parallelSorting82() {
//        for (int j = 2; j < 4; j++) {
//            int[] sorted1DArray = calc.getCopiedArray()[j].clone();
//            sorted1DArray = bubble.b_sort(sorted1DArray);
//            this.sorted2DArray[j] = sorted1DArray;
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
//        for (int j = 4 ; j < 6; j++) {
//            int[] sorted1DArray = calc.getCopiedArray()[j].clone();
//            sorted1DArray = bubble.b_sort(sorted1DArray);
//            this.sorted2DArray[j] = sorted1DArray;
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
//        for (int j = 6; j < 8; j++) {
//            int[] sorted1DArray = calc.getCopiedArray()[j].clone();
//            sorted1DArray = bubble.b_sort(sorted1DArray);
//            this.sorted2DArray[j] = sorted1DArray;
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
//        for (int j = 8; j < 10; j++) {
//            int[] sorted1DArray = calc.getCopiedArray()[j].clone();
//            sorted1DArray = bubble.b_sort(sorted1DArray);
//            this.sorted2DArray[j] = sorted1DArray;
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
//        for (int j = 10; j < 12; j++) {
//            int[] sorted1DArray = calc.getCopiedArray()[j].clone();
//            sorted1DArray = bubble.b_sort(sorted1DArray);
//            this.sorted2DArray[j] = sorted1DArray;
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
//        for (int j = 12; j < 14; j++) {
//            int[] sorted1DArray = calc.getCopiedArray()[j].clone();
//            sorted1DArray = bubble.b_sort(sorted1DArray);
//            this.sorted2DArray[j] = sorted1DArray;
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
//        for (int j = 14; j < 16; j++) {
//            int[] sorted1DArray = calc.getCopiedArray()[j].clone();
//            sorted1DArray = bubble.b_sort(sorted1DArray);
//            this.sorted2DArray[j] = sorted1DArray;
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
}

