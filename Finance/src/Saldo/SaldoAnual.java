package src.Saldo;

import java.util.ArrayList;
import java.util.Scanner;

import models.Despesa;
import models.Receita;

public class SaldoAnual {
    public static void anual(ArrayList<Receita> receitasList, ArrayList<Despesa> despesasList, Scanner t) {
        System.out.print("Informe o ano para calcular o saldo: ");
        int ano = t.nextInt();

        float totalReceitas = 0;
        float totalDespesas = 0;

        for (Receita r : receitasList) {
            if (r.getAno() == ano) {
                totalReceitas += r.getValor();
            }
        }

        for (Despesa d : despesasList) {
            if (d.getAno() == ano) {
                totalDespesas += d.getValor();
            }
        }

        float saldo = totalReceitas - totalDespesas;

        System.out.println("\n========================================");
        System.out.println("      Demonstrativo de Saldo Anual       ");
        System.out.println("                Ano: " + ano);
        System.out.println("========================================");
        System.out.printf(" ► Total de Receitas : R$ %.2f%n", totalReceitas);
        System.out.printf(" ► Total de Despesas  : R$ %.2f%n", totalDespesas);
        System.out.println("----------------------------------------");
        System.out.printf(" ► Saldo Final        : R$ %.2f%n", saldo);
        System.out.println("========================================\n");
    }
}
