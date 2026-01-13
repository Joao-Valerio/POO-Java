package src.Saldo;

import java.util.ArrayList;
import java.util.Scanner;

import models.Despesa;
import models.Receita;

public class SaldoDiario {
    public static void diario(ArrayList<Receita> receitasList, ArrayList<Despesa> despesasList, Scanner t) {
        System.out.print("Informe o dia: ");
        int dia = t.nextInt();
        System.out.print("Informe o mês (1 a 12): ");
        int mes = t.nextInt();
        System.out.print("Informe o ano: ");
        int ano = t.nextInt();

        if (dia < 1 || dia > 31) {
            System.out.println("Dia inválido. Tente novamente.");
            return;
        }
        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido. Tente novamente.");
            return;
        }

        float totalReceitas = 0;
        float totalDespesas = 0;

        for (Receita r : receitasList) {
            if (r.getDia() == dia && r.getMes() == mes && r.getAno() == ano) {
                totalReceitas += r.getValor();
            }
        }

        for (Despesa d : despesasList) {
            if (d.getDia() == dia && d.getMes() == mes && d.getAno() == ano) {
                totalDespesas += d.getValor();
            }
        }

        float saldo = totalReceitas - totalDespesas;

        System.out.println("\n========================================");
        System.out.println("      Demonstrativo de Saldo Diário      ");
        System.out.printf("        Data: %02d/%02d/%d%n", dia, mes, ano);
        System.out.println("========================================");
        System.out.printf(" ► Total de Receitas : R$ %.2f%n", totalReceitas);
        System.out.printf(" ► Total de Despesas  : R$ %.2f%n", totalDespesas);
        System.out.println("----------------------------------------");
        System.out.printf(" ► Saldo Final        : R$ %.2f%n", saldo);
        System.out.println("========================================\n");
    }
}
