package com.denmats.java2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Keeper {
    private final String filename;

    public Keeper(String filename) {
        this.filename = filename;
    }


    public void writeToFile(Calculations calc) {

        StringBuilder builder = new StringBuilder();
        try{
            for(int i = 0; i < calc.getRow(); i++)//for each row
            {
                for(int j = 0; j < calc.getCol(); j++)//for each column
                {
                    builder.append(calc.getRandomArray()[i][j]+",");//append to the output string
                    if(j < calc.getRow() - 1)//if this is not the last row element
                        builder.append(" ");//then add space
                }
                builder.append("\n");//append new line at the end of the row
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(builder.toString());//save the string representation of the array
            writer.close();

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }


    public String readFromFile()  {

        String fileContent = "";

        try{
            File file = new File(filename);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            fileInputStream.read(bytes);
            fileInputStream.close();

            fileContent = new String(bytes, StandardCharsets.UTF_8);

        } catch (NumberFormatException ex) {
            System.out.println("Wrong number format!");
        } catch (Exception ex) {
            System.out.println("Some different exception");
        }
        return fileContent;
    }
}
