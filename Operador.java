package com.leonardo;

public class Operador extends Funcionario{
    private double valorHora;

    public Operador(int idFunc, String nome, String email, String documento, double valorHora){
        super(idFunc, nome, email, documento);
        this.valorHora = valorHora;

    }


    //Getters and Setters

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
