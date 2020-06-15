package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {
        Gerente gerente = new Gerente();
        gerente.setNome("Gerente Marcelo Fernandes");
        gerente.setIdFunc(0124);
        gerente.setEmail("marcelo.gerente@gmail.com");
        gerente.setDocumento("376.098.765-90");
        gerente.setLogin("GMarce01");
        gerente.setSenha("ojuh6");
        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Secretaria Beatriz Silva");
        secretaria.setIdFunc(1567);
        secretaria.setDocumento("134.723.999-21");
        secretaria.setEmail("beatriz_silva@gmail.com");
        secretaria.setTelefone("3806-7893");
        secretaria.setRamal("2345");
        Operador op = new Operador();
        op.setNome("Operador Fernando Costa");
        op.setIdFunc(7866);
        op.setDocumento("261.908.566.12");
        op.setEmail("fer.costa01@gmail.com");
        op.setValorHora(15.00);
        RegistroPonto reg1 = new RegistroPonto();
        reg1.setFunc(gerente);
        reg1.setDataRegistro(LocalDate.now());
        reg1.setHoraEntrada(LocalDateTime.now());
        reg1.apresentarRegistroPonto();
        Thread.sleep(45000);
        RegistroPonto reg2 = new RegistroPonto();
        reg2.setFunc(secretaria);
        reg2.setDataRegistro(LocalDate.now());
        reg2.setHoraEntrada(LocalDateTime.now());
        reg2.apresentarRegistroPonto();
        Thread.sleep(45000);
        RegistroPonto reg3 = new RegistroPonto();
        reg3.setFunc(op);
        reg3.setDataRegistro(LocalDate.now());
        reg3.setHoraEntrada(LocalDateTime.now());
        reg3.apresentarRegistroPonto();
        Thread.sleep(45000);
        reg1.setHoraSaida(LocalDateTime.now());
        reg1.apresentarRegistroPonto();
        Thread.sleep(45000);
        reg2.setHoraSaida(LocalDateTime.now());
        reg2.apresentarRegistroPonto();
        Thread.sleep(45000);
        reg3.setHoraSaida(LocalDateTime.now());
        reg3.apresentarRegistroPonto();

    }
}
