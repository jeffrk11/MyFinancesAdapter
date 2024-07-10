package com.jeff.app.utils;

import com.jeff.app.model.DespesaCSV;

import java.util.List;

public class CsvHandler {

    public String exportToCSV(CsvConvertible csv){
        return csv.toCsv();
    }

    public String exportToCSV(List<? extends CsvConvertible> csvs){
        StringBuilder csvToExport = new StringBuilder();
        for (CsvConvertible csv : csvs) {
            csvToExport.append(csv.toCsv());
            csvToExport.append("\n");
        }

        return csvToExport.toString();
    }
}
