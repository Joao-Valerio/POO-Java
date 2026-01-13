package src.Receitas;

import java.util.ArrayList;
import java.util.Scanner;

import models.Receita;

public class BuscarDataReceita {
    public static void buscar(ArrayList<Receita> receitaList, Scanner t) {
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
        for (Receita r : receitaList) {
            if (dia == r.getDia() && mes == r.getMes() && ano == r.getAno()) {
                System.out.println("---------------------------------");
                System.out.println("Receita encontrada:");
                System.out.println("Valor: R$ " + r.getValor());
                System.out.println("Data: " + String.format("%02d/%02d/%04d", r.getDia(), r.getMes(), r.getAno()));
                System.out.println("---------------------------------");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhuma receita encontrada nessa data.");
        }
    }

}
