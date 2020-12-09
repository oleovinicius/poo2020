package com.leonardo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public RegistroPonto(long idRegPonto, Funcionario func, LocalDate dataRegistro, LocalDateTime horaEntrada) throws InterruptedException {
        this.idRegPonto = idRegPonto;
        this.func = func;
        this.dataRegistro = dataRegistro;
        this.horaEntrada = horaEntrada;
        apresentarRegistroPonto();

    }

    public RegistroPonto(int idRegPonto, RegistroPonto registro, LocalDateTime horaSaida) throws InterruptedException {
        this.idRegPonto = registro.getIdRegPonto();
        this.func = registro.getFunc();
        this.dataRegistro = registro.getDataRegistro();
        this.horaEntrada = registro.getHoraEntrada();
        this.horaSaida = horaSaida;
        apresentarRegistroPonto();

    }

    public void apresentarRegistroPonto() throws InterruptedException {
        System.out.println("====================");
        System.out.println("Funcionário: " + getFunc().getNome());
        System.out.println("Data de Registro: " + getDataRegistro());
        System.out.println("Hora de Entrada: " + getHoraEntrada());
        System.out.println("Hora de Saída: " + getHoraSaida());
        Thread.sleep(1000);

    }




    //Getters and Setters

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }
}
