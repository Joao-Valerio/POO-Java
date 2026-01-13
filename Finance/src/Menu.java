package src;

import java.util.ArrayList;
import java.util.Scanner;

import models.Despesa;
import models.Receita;
import src.Receitas.MenuReceitas;
import src.Despesas.MenuDespesas;
import src.Saldo.MenuSaldo;

public class Menu {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        ArrayList<Receita> receitaList = new ArrayList<>();
        ArrayList<Despesa> despesasList = new ArrayList<>();
        while (true) {

            System.out.println("=== Menu ===");
            System.out.println("1 - Receitas");
            System.out.println("2 - Despesas");
            System.out.println("3 - Saldo");
            System.out.println("0 - Sair");
            int escolha = t.nextInt();
            switch (escolha) {
                case 1:
                    MenuReceitas.receitas(t,receitaList);
                    break;
                case 2:
                    MenuDespesas.despesas(t,despesasList);
                    break;
                case 3:
                    MenuSaldo.saldo(t,receitaList,despesasList);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
