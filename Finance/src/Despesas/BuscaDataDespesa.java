package src.Despesas;

import java.util.ArrayList;
import java.util.Scanner;

import models.Despesa;

public class BuscaDataDespesa {
    public static void busca(ArrayList<Despesa> despesasList, Scanner t) {
        System.out.print("Informe o dia: ");
        int dia = t.nextInt();
        System.out.print("Informe o mês: ");
        int mes = t.nextInt();
        System.out.print("Informe o ano: ");
        int ano = t.nextInt();

        if (dia < 1 || dia > 31) {
            System.out.println("Dia inválido! Tente novamente");
            return;
        } else if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido! Tente novamente");
            return;
        }
        boolean encontrado = false;
        for (Despesa d : despesasList) {
            if (dia == d.getDia() && mes == d.getMes() && ano == d.getAno()) {
                System.out.println("---------------------------------");
                System.out.println("Receita encontrada:");
                System.out.println("Valor: R$ " + d.getValor());
                System.out.println("Data: " + String.format("%02d/%02d/%04d", d.getDia(), d.getMes(), d.getAno()));
                System.out.println("---------------------------------");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhuma receita encontrada nessa data.");
        }
    }
}
