package src.Saldo;

import java.util.ArrayList;

import models.Despesa;
import models.Receita;

public class Saldo {
        public static void total(ArrayList<Receita> receitasList, ArrayList<Despesa> despesasList) {
        float totalReceitas = 0;
        float totalDespesas = 0;
        for (Receita r : receitasList) {
            totalReceitas += r.getValor();
        }

        for (Despesa d : despesasList) {
            totalDespesas += d.getValor();
        }

        float saldo = totalReceitas - totalDespesas;

        System.out.println("Total de Receitas: R$ " + totalReceitas);
        System.out.println("Total de Despesas: R$ " + totalDespesas);
        System.out.println("Seu saldo atual é: R$ " + saldo);
    }
}

