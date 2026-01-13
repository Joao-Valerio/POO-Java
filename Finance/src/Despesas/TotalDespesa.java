package src.Despesas;

import java.util.ArrayList;
import java.util.Scanner;

import models.Despesa;

public class TotalDespesa {
    public static void total(ArrayList<Despesa> despesasList, Scanner t) {
        float total = 0;
        System.out.println("Qual ano das despesas ?");
        int ano =  t.nextInt();
        System.out.println("Informe o mês a ser visualizado o total das despesas");
        int mes = t.nextInt();
        if(mes < 1 || mes > 12){
            System.out.println("Mês inválido! Tente novamente");
            return;
        }
        for(Despesa d : despesasList){
            if (d.getAno() == ano && d.getMes() == mes) {
                total+=d.getValor();
            }
        }
        System.out.println("O valor total de despesas no mês " + mes + "/" + ano + " é: R$ " + total);
    }
}
