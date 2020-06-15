package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

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
    public void apresentarRegistroPonto(){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("==================================");
        System.out.println("Funcionário: " + func.getNome());
        System.out.println("Data de registro:  " + dataRegistro.format(formatar));
        System.out.println("Hora entrada: " + horaEntrada.format(formatarHora));
        if(horaSaida != null){
            DateTimeFormatter formataSaida = DateTimeFormatter.ofPattern("HH:mm:ss");
            System.out.println("Hora saída: " + horaSaida.format(formataSaida));
            return;
        }
        System.out.println("Hora saída: " + horaSaida);
        System.out.println("==================================");
    }

}
