package com.leonardo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {
    	//Contadores
    	int contadorDeFunc = 1;
    	int contadorDeReg = 1;


    	//Populando as classes
	    Gerente gerente = new Gerente(contadorDeFunc, "Gerente João",
                                                      "joao@gmail.com",
                                                      "56465465465",
                                                      "joao","1234");
	    contadorDeFunc++;

	    Secretaria secretaria = new Secretaria(contadorDeFunc, "Secretaria Maria",
														       "maria@gmail.com",
                                                               "8965478558",
                                                               "0800-4554",
                                                               "225");
		contadorDeFunc++;

		Operador operador = new Operador(contadorDeFunc, "Operador Zé",
                                                    	  "zé@gmail.com",
                                                    	  "87896546989",
                                                    	  80.00);
		contadorDeFunc++;


		//Registrando as entradas
		RegistroPonto registro1 = new RegistroPonto(contadorDeReg, gerente, LocalDate.now(), LocalDateTime.now());
			contadorDeReg++;

		RegistroPonto registro2 = new RegistroPonto(contadorDeReg, secretaria, LocalDate.now(), LocalDateTime.now());
			contadorDeReg++;

		RegistroPonto registro3 = new RegistroPonto(contadorDeReg, operador, LocalDate.now(), LocalDateTime.now());
			contadorDeReg++;


		//Registrando as saidas
		RegistroPonto registro4 = new RegistroPonto(contadorDeReg, registro1, LocalDateTime.now());
			contadorDeReg++;

		RegistroPonto registro5 = new RegistroPonto(contadorDeReg, registro2, LocalDateTime.now());
			contadorDeReg++;

		RegistroPonto registro6 = new RegistroPonto(contadorDeReg, registro3, LocalDateTime.now());
			contadorDeReg++;

	}
}
