package com.entity;

public class Pessoa {

    private String nome, estado, email, endereco, complemento;
    private int cpf, rg, telefone;
    private double saldo = 0.00, fatura = 0.00;

    public Pessoa(String nome, int cpf, int rg, int telefone,String email, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public double  getFatura() {
        return fatura;
    }
    public String getNome() {
        return nome;
    }
    public int getCpf() {
        return cpf;
    }
    public int getRg() {
        return rg;
    }
    public int getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getComplemento() {
        return complemento;
    }
}
