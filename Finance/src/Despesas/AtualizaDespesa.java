package src.Despesas;

import java.util.ArrayList;
import java.util.Scanner;

import models.Despesa;

public class AtualizaDespesa {
    public static void atualizar(ArrayList<Despesa> despesasList, Scanner t) {
        System.out.println("\n=== Lista de Despesas ===");
        for (int i = 0; i < despesasList.size(); i++) {
            Despesa d = despesasList.get(i);
            System.out.println("[" + (i + 1) + "] Despesa com valor de R$ " + d.getValor()
                    + " na data " + String.format("%02d/%02d/%04d", d.getDia(), d.getMes(), d.getAno()));
        }

        System.out.print("Qual receita será atualizada: ");
        int numero = t.nextInt();

        if (numero <= 0 || numero > despesasList.size()) {
            System.out.println("Número inválido.");
            return;
        }

        Despesa d = despesasList.get(numero - 1); 

        System.out.println("O que deseja atualizar?");
        System.out.println("1 - Valor");
        System.out.println("2 - Data");
        System.out.println("3 - Valor e Data");
        int opcao = t.nextInt();

        if (opcao == 1 || opcao == 3) {
            System.out.print("Novo valor: ");
            float valor = t.nextFloat();
            d.setValor(valor);
        }

        if (opcao == 2 || opcao == 3) {
            System.out.print("Novo dia: ");
            int dia = t.nextInt();
            d.setDia(dia);

            System.out.print("Novo mês: ");
            int mes = t.nextInt();
            d.setMes(mes);

            System.out.print("Novo ano: ");
            int ano = t.nextInt();
            d.setAno(ano);
        }

        System.out.println("Despesa atualizada com sucesso!");
}
}