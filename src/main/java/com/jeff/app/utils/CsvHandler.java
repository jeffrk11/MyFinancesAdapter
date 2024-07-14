package com.jeff.app.utils;

import com.jeff.app.configuration.ConfigurationHandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvHandler {

    ConfigurationHandler config;

    public CsvHandler(ConfigurationHandler config){
        this.config = config;
    }

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

    public List<List<String>> readCSV(String filename, String delimiter) throws IOException {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(config.getStatementsCsvInputFilepath()+"\\"+filename))) {
            String line;
            while ((line = br.readLine()) != null) {


                records.add(readCells(line,delimiter));
            }
        }
        return records;
    }
    //CARD_PAYMENT,Current,2024-07-11 22:16:10,2024-07-12 02:53:38,Pcdiga,-236.95,0.00,EUR,COMPLETED,127.32
    //"TRANSFER",Current,2024-07-12 01:00:00,2024-07-12 11:45:23,"To Meo, Sa",-51.39,0.00,EUR,COMPLETED,75.93
    private List<String> readCells(String line, String delimiter){
        ArrayList<String> result = new ArrayList<>();
        String[] values = line.split(delimiter);
        boolean endsCell = true;
        StringBuilder cellAux = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            cellAux.append(values[i]);

            if(!endsCell && values[i].endsWith("\""))
                endsCell = true;


            if(cellAux.toString().startsWith("\"") && !cellAux.toString().endsWith("\"")){
                cellAux.append(delimiter);
                endsCell = false;
                continue;
            }

            result.add(cellAux.toString());
            cellAux = new StringBuilder();


        }
        return result;
    }
}
