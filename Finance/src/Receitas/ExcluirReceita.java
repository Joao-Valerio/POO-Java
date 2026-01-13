package src.Receitas;

import java.util.ArrayList;
import java.util.Scanner;
import models.Receita;

public class ExcluirReceita {
    public static void excluir(ArrayList<Receita> receitaList, Scanner t) {
        System.out.println("Qual receita será excluida");
        int numero = t.nextInt();
        int indice = numero - 1;
        if (indice < 0 || indice >= receitaList.size()) {
            System.out.println("Número inválido.");
            return;
        }
        receitaList.remove(indice);
        System.out.println("Receita removida com sucesso!");
    }

}
