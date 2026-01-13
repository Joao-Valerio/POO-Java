package src.Receitas;

import java.util.ArrayList;
import java.util.Scanner;
import models.Receita;

public class TotalReceita {
    public static void total(ArrayList<Receita> receitaList, Scanner t) {
        float total = 0;
        System.out.println("Qual ano das receitas ?");
        int ano =  t.nextInt();
        System.out.println("Informe o mês a ser visualizado o total das receitas");
        int mes = t.nextInt();
        if(mes < 1 || mes > 12){
            System.out.println("Mês inválido! Tente novamente");
            return;
        }
        for(Receita r : receitaList){
            if (r.getAno() == ano && r.getMes() == mes) {
                total+=r.getValor();
            }
        }
        System.out.println("O valor total de receitas no mês " + mes + "/" + ano + " é: R$ " + total);
    }
}
