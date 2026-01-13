package models;

public class Despesa {
    private float valor;
    private int dia;
    private int mes;
    private int ano;

    public Despesa() {
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Valor: R$" + valor + " | Data: "
                + String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
