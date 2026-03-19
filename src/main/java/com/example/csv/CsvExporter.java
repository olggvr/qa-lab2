package com.example.csv;

import com.example.math.MathFunction;

import java.io.FileWriter;
import java.io.IOException;

public class CsvExporter {

    public static void export(MathFunction function,
                              double start,
                              double end,
                              double step,
                              String filename) {

        try (FileWriter writer = new FileWriter(filename)) {

            // заголовок
            writer.write("x,result\n");

            for (double x = start; x <= end; x += step) {
                double result = function.calculate(x);

                writer.write(x + "," + result + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}