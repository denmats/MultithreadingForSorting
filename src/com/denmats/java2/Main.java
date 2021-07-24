package com.denmats.java2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Calculations calc = new Calculations(16, 1000);
        Keeper keeper = new Keeper("data.txt");
        keeper.writeToFile(calc);
        //Read saved data as String value and turn it into 2D array
        calc.setCopiedArray(keeper.readFromFile());

        //Printing for testing purposes.
//        System.out.println("RandomArray");
//        calc.printTarget2DArr(calc.getRandomArray());
//        System.out.println();
//
//        System.out.println("Copied Array");
//        calc.printTarget2DArr(calc.getCopiedArray());
//        System.out.println();


        //Sorting "without" threads
        System.out.println("\nNO Threads:)");
        long start = System.nanoTime();
        Contestant contestant = new Contestant(calc);
        contestant.run(calc);
//        calc.printTarget2DArr(contestant.getSorted2DArray());
        long finish = System.nanoTime();
        long timeElapsed = finish - start;

        System.out.println("Time of execution of Contestant 0 (no threads) is " + timeElapsed / 1000000000 + " sec");
        System.out.println("Time of execution of Contestant 0 (no threads) is  " + timeElapsed + " Nano sec");

        //Thread 1
        System.out.println("\n1 Threads");
        Contestant1 contestant1 = new Contestant1(calc);
        Thread thread1 = new Thread(contestant1);
        long start1 = System.nanoTime();

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        calc.printTarget2DArr(contestant1.getSorted2DArray());
        long finish1 = System.nanoTime();
        long timeElapsed1 = finish1 - start1;
        System.out.println("Time of execution of Contestant 1 (" + thread1.getName() + ") is " + timeElapsed1 / 1000000000 + " sec");
        System.out.println("Time of execution of Contestant 1 (" + thread1.getName() + ") is  " + timeElapsed1 + " Nano sec");


        //2 Threads
        System.out.println("\n2 Threads");
        Contestant2 contestant2 = new Contestant2(calc);
        Thread thread2 = new Thread(contestant2);
        long start2 = System.nanoTime();
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long finish2 = System.nanoTime();
        long timeElapsed2 = finish2 - start2;

        Thread thread21 = new Thread(new Contestant2(calc).mergeSortParallel2());
        long start21 = System.nanoTime();
        thread21.start();
        try {
            thread21.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long finish21 = System.nanoTime();
        long timeElapsed21 = finish21 - start21;
//        calc.printTarget2DArr(contestant2.getSorted2DArray());
        System.out.println("Time of execution of Contestant 2 (" + thread2.getName() + ") is " + (timeElapsed2 + timeElapsed21) / 1000000000 + " sec");
        System.out.println("Time of execution of Contestant 2 (" + thread2.getName() + ") is " + (timeElapsed2 + timeElapsed21) + " Nano sec");


        //Thread 4
        System.out.println("\n4 Threads");
        Contestant4 contestant4 = new Contestant4(calc);
        long totalExecutionTimeFor4Threads = 0;
        Thread[] threads = new Thread[4];
        long start4 = System.nanoTime();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(contestant4, "thread [" + i + "]");
            threads[i].start();
            long finish4 = System.nanoTime();
            long timeElapsed4 = finish4 - start4;
            System.out.println("Time of execution of Contestant 4 (" + threads[i].getName() + ") is " + (timeElapsed4) / 1000000000 + " sec");
            System.out.println("Time of execution of Contestant 4 (" + threads[i].getName() + ") is " + (timeElapsed4) + " Nano sec");
            totalExecutionTimeFor4Threads += timeElapsed4;

        }
        System.out.println("Total time for 4 threads is " + totalExecutionTimeFor4Threads / 1000000000 + " sec");
        System.out.println("Total time for 4 threads is " + totalExecutionTimeFor4Threads + " Nano sec");
//        calc.printTarget2DArr(contestant4.getSorted2DArray());


        //Thread 8
        System.out.println("\n8 Threads");
        Contestant8 contestant8 = new Contestant8(calc);
        long totalExecutionTimeFor8Threads = 0;
        Thread[] threads8 = new Thread[8];
        long start8 = System.nanoTime();
        for (int i = 0; i < threads8.length; i++) {
            threads8[i] = new Thread(contestant8, "thread [" + i + "]");
            threads8[i].start();
            long finish8 = System.nanoTime();
            long timeElapsed8 = finish8 - start8;
            System.out.println("Time of execution of Contestant 8 (" + threads8[i].getName() + ") is " + (timeElapsed8) / 1000000000 + " sec");
            System.out.println("Time of execution of Contestant 8 (" + threads8[i].getName() + ") is " + (timeElapsed8) + " Nano sec");
            totalExecutionTimeFor8Threads += timeElapsed8;
        }
        System.out.println("Total time for 8 threads is " + totalExecutionTimeFor8Threads / 1000000000 + " sec");
        System.out.println("Total time for 8 threads is " + totalExecutionTimeFor8Threads + " Nano sec");
//        calc.printTarget2DArr(contestant8.getSorted2DArray());


        //Thread 16
        System.out.println("\n16 Threads");
        Contestant16 contestant16 = new Contestant16(calc);
        long totalExecutionTimeFor16Threads = 0;
        Thread[] threads16 = new Thread[16];
        long start16 = System.nanoTime();
        for (int i = 0; i < threads16.length; i++) {
            threads16[i] = new Thread(contestant16, "thread [" + i + "]");
            threads16[i].start();
            long finish16 = System.nanoTime();
            long timeElapsed16 = finish16 - start16;
            System.out.println("Time of execution of Contestant 16 (" + threads16[i].getName() + ") is " + (timeElapsed16) / 1000000000 + " sec");
            System.out.println("Time of execution of Contestant 16 (" + threads16[i].getName() + ") is " + (timeElapsed16) + " Nano sec");
            totalExecutionTimeFor16Threads += timeElapsed16;
        }
        System.out.println("Total time for 16 threads is " + totalExecutionTimeFor16Threads / 1000000000 + " sec");
        System.out.println("Total time for 16 threads is " + totalExecutionTimeFor16Threads + " Nano sec");
//        calc.printTarget2DArr(contestant16.getSorted2DArray());
    }
}

