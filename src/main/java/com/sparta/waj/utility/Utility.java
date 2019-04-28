package com.sparta.waj.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Utility
{
    private Utility(){}

    public static String fileToString(String filename)
    {
        String ifJson = "";
        File inputFile = new File(filename);

        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            String nextLine;
            while ((nextLine = bufferedReader.readLine()) != null)
            {
                ifJson += nextLine.trim();
            }

            bufferedReader.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        return ifJson;
    }

}
