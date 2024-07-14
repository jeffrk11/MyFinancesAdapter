package com.jeff.app.model;

import com.jeff.app.utils.CsvConvertible;

import java.util.List;

public class DespesaCSV implements CsvConvertible<DespesaCSV> {

    private String descricao;
    private float valor;
    private String dataVencimento;
    private String categoria;
    private String subCategoria;
    private String nomeCartao;
    private String observacao;


    public DespesaCSV() {}

    public DespesaCSV(String descricao, float valor, String dataVencimento, String categoria, String subCategoria, String nomeCartao, String observacao) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.nomeCartao = nomeCartao;
        this.observacao = observacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toCsv() {
        return new StringBuilder().append(getDescricao()).append(",")
                .append(getValor()).append(",")
                .append(getDataVencimento()).append(",")
                .append(getCategoria()).append(",")
                .append(getSubCategoria()).append(",")
                .append(getNomeCartao()).append(",")
                .append(getObservacao()).toString();
    }

    @Override
    public DespesaCSV fromCsv(List<List<String>> records) {
        return null;
    }
}
