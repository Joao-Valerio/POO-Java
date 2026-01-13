package src.Saldo;

import java.util.ArrayList;
import java.util.Scanner;

import models.Despesa;
import models.Receita;

public class MenuSaldo {
    public static void saldo(Scanner t, ArrayList<Receita> receitasList, ArrayList<Despesa> despesasList) {
        while (true) {
            System.out.println("=== Saldo ===");
            System.out.println("1 - Saldo total");
            System.out.println("2 - Saldo diário");
            System.out.println("3 - Saldo mensal");
            System.out.println("4 - Saldo anual");
            System.out.println("0 - Sair");
            int escolha = t.nextInt();
            switch (escolha) {
                case 1:
                    Saldo.total(receitasList, despesasList);
                    break;
                case 2:
                    SaldoDiario.diario(receitasList, despesasList,t);
                    break;
                case 3:
                    SaldoDiario.diario(receitasList, despesasList,t);
                    break;
                case 4:
                    SaldoAnual.anual(receitasList, despesasList,t);
                    break;
                case 0 :
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida! Tente Novamente");
            }
        }
    }
}
