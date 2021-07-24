package com.denmats.java2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Calculations {
    private final int row;
    private final int col;
    private final int[][] randomArray;
    private final int[][] copiedArray;

    public Calculations(int row, int col){
        this.row = row;
        this.col = col;
        this.randomArray = getRandom2DArray();
        this.copiedArray = new int[this.row][this.col];
    }

//Print 2D array
    public void printTarget2DArr(int[][] arr) {
        for (int i = 0; i < this.getRow(); i++) {
            for (int j = 0; j < this.getCol(); j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public int[][] getCopiedArray() {
        return copiedArray;
    }

    public void setCopiedArray(String savedFile) {

        try {
            Reader inputString = new StringReader(savedFile);
            BufferedReader reader = new BufferedReader(inputString);
            String line = "";
            int row = 0;

            while ((line = reader.readLine()) != null) {
                String[] cols = line.split(","); //delimited by comma
                int col = 0;
                for (String c : cols) {
                    this.copiedArray[row][col] = Integer.parseInt(c.trim());//clean whitespaces
                    col++;
                }
                row++;
            }
            reader.close();
        } catch(FileNotFoundException ex) {
            System.out.println("File is not found");
        } catch (NumberFormatException ex) {
            System.out.println("Wrong format");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public int[][] getRandomArray() {
        return randomArray;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }


    public int[][] getRandom2DArray(){
        int[][] tab = new int[row][col];
        Random rand = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tab[i][j] = rand.nextInt(20)+1;
            }
        }
        return tab;
    }
}
