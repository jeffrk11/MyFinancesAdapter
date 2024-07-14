package com.jeff.app.model.bank.statement;

import com.jeff.app.utils.CsvConvertible;

import java.util.ArrayList;
import java.util.List;

public class RevolutStatement implements CsvConvertible<RevolutStatement> {

    private List<RevolutStatementFields> fields;

    public List<RevolutStatementFields> getFields() {
        return fields;
    }
    public void setFields(List<RevolutStatementFields> fields) {
        this.fields = fields;
    }

    @Override
    public String toCsv() {
        return "";
    }

    @Override
    public RevolutStatement fromCsv(List<List<String>> records) {
        fields = new ArrayList<>();
        if(records.isEmpty() || records.size() == 1)
            return null;

        records.forEach(r -> {

            if (records.indexOf(r) == 0)
                return;

            RevolutStatementFields revolutStatementFields = new RevolutStatementFields();
            revolutStatementFields.setType(r.get(0))
                    .setProduct(r.get(1))
                    .setStartedDate(r.get(2))
                    .setCompletedDate(r.get(3))
                    .setDescription(r.get(4))
                    .setAmount(Float.parseFloat(r.get(5)))
                    .setFee(Float.parseFloat(r.get(6)))
                    .setCurrency(r.get(7))
                    .setState(r.get(8))
                    .setBalance(Float.parseFloat(r.get(9)));
            fields.add(revolutStatementFields);
        });
        return this;
    }
}
