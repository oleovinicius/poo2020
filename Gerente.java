package com.leonardo;

public class Gerente extends Funcionario{
    private String login;
    private String senha;

    public Gerente(int idFunc, String nome, String email, String documento, String login, String senha){
        super(idFunc, nome, email, documento);
        this.login = login;
        this.senha = senha;

    }



    //Getters and Setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSeha(String senha) {
        this.senha = senha;
    }
}
