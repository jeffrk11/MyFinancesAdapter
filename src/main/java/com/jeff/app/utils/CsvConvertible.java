package com.jeff.app.utils;

import java.util.List;

public interface CsvConvertible <T> {

    String toCsv();
    T fromCsv(List<List<String>> records);
}
