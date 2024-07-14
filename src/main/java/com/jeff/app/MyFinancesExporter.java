package com.jeff.app;

import com.jeff.app.configuration.ConfigurationHandler;
import com.jeff.app.model.DespesaCSV;
import com.jeff.app.utils.CsvConvertible;
import com.jeff.app.utils.CsvHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.io.PrintWriter;

public class MyFinancesExporter {

    private CsvHandler csvHandler;
    private ConfigurationHandler config;

    public MyFinancesExporter(ConfigurationHandler config, CsvHandler csvHandler) throws IOException {
        this.config = config;
        this.csvHandler = csvHandler;
    }

    public boolean exportDespesasToCSv(List<DespesaCSV> despesas) throws FileNotFoundException {
        String csv = csvHandler.exportToCSV(despesas);
        File csvOutputFile = new File(config.getDespesasCsvOutputFilepath());
        PrintWriter pw = new PrintWriter(csvOutputFile);
        pw.print(csv);
        pw.flush();
        return csvOutputFile.exists();
    }
}
