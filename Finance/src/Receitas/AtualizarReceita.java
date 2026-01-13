package src.Receitas;

import java.util.ArrayList;
import java.util.Scanner;
import models.Receita;

public class AtualizarReceita {
    public static void atualizar(ArrayList<Receita> receitaList, Scanner t) {

        System.out.println("\n=== Lista de Receitas ===");
        for (int i = 0; i < receitaList.size(); i++) {
            Receita r = receitaList.get(i);
            System.out.println("[" + (i + 1) + "] Receita com valor de R$ " + r.getValor()
                    + " na data " + String.format("%02d/%02d/%04d", r.getDia(), r.getMes(), r.getAno()));
        }

        System.out.print("Qual receita será atualizada: ");
        int numero = t.nextInt();

        if (numero <= 0 || numero > receitaList.size()) {
            System.out.println("Número inválido.");
            return;
        }

        Receita r = receitaList.get(numero - 1);

        System.out.println("O que deseja atualizar?");
        System.out.println("1 - Valor");
        System.out.println("2 - Data");
        System.out.println("3 - Valor e Data");
        int opcao = t.nextInt();

        if (opcao == 1 || opcao == 3) {
            System.out.print("Novo valor: ");
            float valor = t.nextFloat();
            r.setValor(valor);
        }

        if (opcao == 2 || opcao == 3) {
            System.out.print("Novo dia: ");
            int dia = t.nextInt();
            r.setDia(dia);

            System.out.print("Novo mês: ");
            int mes = t.nextInt();
            r.setMes(mes);

            System.out.print("Novo ano: ");
            int ano = t.nextInt();
            r.setAno(ano);
        }

        System.out.println("Receita atualizada com sucesso!");
    }
}
