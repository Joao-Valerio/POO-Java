package src.Despesas;

import java.util.ArrayList;

import models.Despesa;

public class ListarDespesa {
    public static void listar(ArrayList<Despesa> despesasList) {
        if (despesasList.isEmpty()) {
            System.out.println("Não há receitas");
        } else {
            for (int i = 0; i < despesasList.size(); i++) {
                Despesa d = despesasList.get(i);
                System.out.println("A receita " + (i + 1) + " tem um valor de R$ " + d.getValor()
                        + " na data " + String.format("%02d/%02d/%04d", d.getDia(), d.getMes(), d.getAno()));
            }
        }
    }
}
