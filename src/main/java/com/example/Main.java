package com.example;

import com.example.csv.CsvExporter;
import com.example.math.base.*;
import com.example.math.log.*;
import com.example.math.trig.*;
import com.example.system.*;

public class Main {

    public static void main(String[] args) {

        Sin sin = new Sin(1e-6);
        Ln ln = new Ln(1e-6);

        Cos cos = new Cos(sin);
        Cot cot = new Cot(sin, cos);
        Csc csc = new Csc(sin);
        Sec sec = new Sec(cos);

        TrigExpression trig =
                new TrigExpression(cot, csc, sec, cos);

        Log2 log2 = new Log2(ln);
        Log3 log3 = new Log3(ln);
        Log5 log5 = new Log5(ln);
        Log10 log10 = new Log10(ln);

        LogExpression log =
                new LogExpression(ln, log2, log3, log5, log10);

        FunctionSystem system =
                new FunctionSystem(trig, log);

        CsvExporter.export(
                system,
                -5,
                5,
                0.1,
                "output.csv"
        );
    }
}