package src.Receitas;
import models.Receita;
import java.util.Scanner;

public class CadastrarReceita {
    public static Receita cadastrar(Scanner t) {
        Receita receita = new Receita();
        System.out.print("Valor: ");
        float valor = t.nextFloat();
        receita.setValor(valor);
        System.out.print("Dia: ");
        int dia = t.nextInt();
        receita.setDia(dia);
        System.out.print("Mês: ");
        int mes = t.nextInt();
        receita.setMes(mes);
        System.out.print("Ano: ");
        int ano = t.nextInt();
        receita.setAno(ano);
        return receita;
    }
}
