package src.Receitas;

import java.util.ArrayList;
import java.util.Scanner;
import models.Receita;

public class MenuReceitas {
    public static void receitas(Scanner t,ArrayList<Receita> receitaList) {
        while (true) {
            System.out.println("=== Receitas ===");
            System.out.println("1 - Cadastrar nova receita");
            System.out.println("2 - Listar todas as receitas");
            System.out.println("3 - Buscar receita por data");
            System.out.println("4 - Atualizar receita");
            System.out.println("5 - Excluir receita");
            System.out.println("6 - Total de receitas(mês)");
            System.out.println("0 - Sair");
            int escolha = t.nextInt();
            switch (escolha) {
                case 1:
                    Receita receita = CadastrarReceita.cadastrar(t);
                    receitaList.add(receita);
                    break;
                case 2:
                    ListarReceita.listar(receitaList);
                    break;
                case 3:
                    BuscarDataReceita.buscar(receitaList, t);
                    break;
                case 4:
                    AtualizarReceita.atualizar(receitaList, t);
                    break;
                case 5:
                    ExcluirReceita.excluir(receitaList, t);
                    break;
                case 6:
                    TotalReceita.total(receitaList, t);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente");
            }
        }
    }
}
