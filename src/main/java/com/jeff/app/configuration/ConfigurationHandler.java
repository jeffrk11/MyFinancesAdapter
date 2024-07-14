package com.jeff.app.configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationHandler {

    private Properties properties;
    private String configPath = "src\\resources\\app.config";

    public ConfigurationHandler() throws IOException {
        properties = new Properties();
        FileInputStream fis = new FileInputStream(configPath);
        properties.load(fis);
    }

    public String getDespesasCsvOutputFilepath(){
        return properties.getProperty("despesa.csv.output.filepath");
    }
    public String getReceitasCsvOutputFilepath(){
        return properties.getProperty("receita.csv.output.filepath");
    }
    public String getStatementsCsvInputFilepath(){
        return properties.getProperty("bank.csv.input.filepath");
    }
}

