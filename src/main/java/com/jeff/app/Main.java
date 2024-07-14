package com.jeff.app;

import com.jeff.app.configuration.ConfigurationHandler;
import com.jeff.app.model.bank.statement.RevolutStatement;
import com.jeff.app.utils.CsvHandler;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConfigurationHandler config = new ConfigurationHandler();
        CsvHandler csvHandler = new CsvHandler(config);
        MyFinancesExporter exporter = new MyFinancesExporter(config,csvHandler);


        RevolutStatement revolutStatement = new RevolutStatement();
        revolutStatement.fromCsv(csvHandler.readCSV("revolut.csv", ","));


    }
}
