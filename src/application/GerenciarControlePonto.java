package application;

import Entidades.Gerente;
import Entidades.Operador;
import Entidades.RegistroPonto;
import Entidades.Secretaria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {

        //Instanciando entidades
        //Gerente
        Gerente gerente = new Gerente(
                1,
                "Gerente João",
                "admin@gmail.com",
                "word.ptx",
                "testando123",
                "159753"
        );

        //Secretaria
        Secretaria secretaria = new Secretaria(
                2,
                "Secretaria Maria",
                "secretaria@gmail.com",
                "powerPoint.sps",
                "19982902473",
                "82"
        );

        //Operador
        Operador operador = new Operador(2,
                "Operador Zé",
                "operador@gmai.com",
                "powerPoint.sps",
                14.00
        );

        //Registrando entrada | Gerente
        RegistroPonto registroPontoGerente = new RegistroPonto(1,gerente,LocalDate.now());
        registroPontoGerente.setHoraEntrada(LocalDateTime.now());
        registroPontoGerente.apresentarRegistroPonto();
        Thread.sleep(2000);

        //Registrando entrada | Secretária
        RegistroPonto registroPontoSecretaria = new RegistroPonto(1,secretaria,LocalDate.now());
        registroPontoSecretaria.setHoraEntrada(LocalDateTime.now());
        registroPontoSecretaria.apresentarRegistroPonto();
        Thread.sleep(3000);

        //Registrando entrada | Operador
        RegistroPonto registroPontoOperador = new RegistroPonto(1,operador,LocalDate.now());
        registroPontoOperador.setHoraEntrada(LocalDateTime.now());
        registroPontoOperador.apresentarRegistroPonto();
        Thread.sleep(2000);

        //Registrando saída | Gerente
        registroPontoGerente.setHoraSaida(LocalDateTime.now());
        registroPontoGerente.apresentarRegistroPonto();
        Thread.sleep(5000);

        //Registrando saída | Secretária
        registroPontoSecretaria.setHoraSaida(LocalDateTime.now());
        registroPontoSecretaria.apresentarRegistroPonto();
        Thread.sleep(4000);

        //Registrando saída | Operador
        registroPontoOperador.setHoraSaida(LocalDateTime.now());
        registroPontoOperador.apresentarRegistroPonto();
        Thread.sleep(6000);















    }
}