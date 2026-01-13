package src.Despesas;

import java.util.ArrayList;
import java.util.Scanner;

import models.Despesa;

public class CadastrarDespesa {
    public static Despesa cadastrar(ArrayList<Despesa> despesasList, Scanner t) {
        Despesa despesa = new Despesa();
        System.out.print("Valor: ");
        float valor = t.nextFloat();
        despesa.setValor(valor);
        System.out.print("Dia: ");
        int dia = t.nextInt();
        despesa.setDia(dia);
        System.out.print("Mês: ");
        int mes = t.nextInt();
        despesa.setMes(mes);
        System.out.print("Ano: ");
        int ano = t.nextInt();
        despesa.setAno(ano);
        return despesa;
    }
}
