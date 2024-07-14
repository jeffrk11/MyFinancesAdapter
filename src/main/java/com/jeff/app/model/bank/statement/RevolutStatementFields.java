package com.jeff.app.model.bank.statement;

public class RevolutStatementFields {
    String Type;
    String Product;
    String StartedDate;
    String CompletedDate;
    String Description;
    float Amount;
    float Fee;
    String Currency;
    String State;
    float Balance;

    public String getType() {
        return Type;
    }
    public RevolutStatementFields setType(String type) {
        Type = type;
        return this;
    }
    public String getProduct() {
        return Product;
    }
    public RevolutStatementFields setProduct(String product) {
        Product = product;
        return this;
    }
    public String getStartedDate() {
        return StartedDate;
    }
    public RevolutStatementFields setStartedDate(String startedDate) {
        StartedDate = startedDate;
        return this;
    }
    public String getCompletedDate() {
        return CompletedDate;
    }
    public RevolutStatementFields setCompletedDate(String completedDate) {
        CompletedDate = completedDate;
        return this;
    }
    public String getDescription() {
        return Description;
    }
    public RevolutStatementFields setDescription(String description) {
        Description = description;
        return this;
    }
    public float getAmount() {
        return Amount;
    }
    public RevolutStatementFields setAmount(float amount) {
        Amount = amount;
        return this;
    }
    public float getFee() {
        return Fee;
    }
    public RevolutStatementFields setFee(float fee) {
        Fee = fee;
        return this;
    }
    public String getCurrency() {
        return Currency;
    }
    public RevolutStatementFields setCurrency(String currency) {
        Currency = currency;
        return this;
    }
    public String getState() {
        return State;
    }
    public RevolutStatementFields setState(String state) {
        State = state;
        return this;
    }
    public float getBalance() {
        return Balance;
    }
    public RevolutStatementFields setBalance(float balance) {
        Balance = balance;
        return this;
    }
}
