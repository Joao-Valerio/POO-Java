package src.Despesas;

import java.util.ArrayList;
import java.util.Scanner;

import models.Despesa;

public class ExcluirDespesa {
public static void excluir(ArrayList<Despesa> despesasList, Scanner t) {
        System.out.println("Qual despesa será excluida");
        int numero = t.nextInt();
        int indice = numero - 1;
        if (indice < 0 || indice >= despesasList.size()) {
            System.out.println("Número inválido.");
            return;
        }
        despesasList.remove(indice);
        System.out.println("Despesa removida com sucesso!");
}
}
