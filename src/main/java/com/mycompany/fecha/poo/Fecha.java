package com.mycompany.fecha.poo;

public class Fecha {
    private int dia;
    private int mes;
    private int ano;
//////////////////////////////////////////////////////  Este codigo es de complejidad constante o(1)/////////////////////////
    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String fechaCorta() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean validarFecha() {
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public String mesLetra() {
        String nombreMes = "";
        switch (mes) {
            case 1:
                nombreMes = "enero";
                break;
            case 2:
                nombreMes = "febrero";
                break;
            case 3:
                nombreMes = "marzo";
                break;
            case 4:
                nombreMes = "abril";
                break;
            case 5:
                nombreMes = "mayo";
                break;
            case 6:
                nombreMes = "junio";
                break;
            case 7:
                nombreMes = "julio";
                break;
            case 8:
                nombreMes = "agosto";
                break;
            case 9:
                nombreMes = "septiembre";
                break;
            case 10:
                nombreMes = "octubre";
                break;
            case 11:
                nombreMes = "noviembre";
                break;
            case 12:
                nombreMes = "diciembre";
                break;
        }
        return nombreMes;
    }

    public String fechaLarga() {
        return dia + " de " + mesLetra() + " de " + ano;
    }
}


