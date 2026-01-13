package src.Receitas;

import java.util.ArrayList;

import models.Receita;

public class ListarReceita {
    public static void listar(ArrayList<Receita> receitaList) {
        if (receitaList.isEmpty()) {
            System.out.println("Não há receitas");
        } else {
            for (int i = 0; i < receitaList.size(); i++) {
                Receita r = receitaList.get(i);
                System.out.println("A receita " + (i + 1) + " tem um valor de R$ " + r.getValor()
                        + " na data " + String.format("%02d/%02d/%04d", r.getDia(), r.getMes(), r.getAno()));
            }
        }
    }
}
