package src.Despesas;

import java.util.ArrayList;
import java.util.Scanner;

import models.Despesa;

public class MenuDespesas {
    public static void despesas(Scanner t,ArrayList<Despesa> despesasList) {
        while (true) {
            System.out.println("=== Despesas ===");
            System.out.println("1 - Cadastrar nova despesa");
            System.out.println("2 - Listar todas as despesas");
            System.out.println("3 - Buscar despesa por data");
            System.out.println("4 - Atualizar despesa");
            System.out.println("5 - Excluir despesa");
            System.out.println("6 - Total de despesas(mês)");
            System.out.println("0 - Sair");
            int escolha = t.nextInt();
            switch (escolha) {
                case 1:
                    Despesa despesa = CadastrarDespesa.cadastrar(despesasList, t);
                    despesasList.add(despesa);
                    break;
                case 2:
                    ListarDespesa.listar(despesasList);
                    break;
                case 3:
                    BuscaDataDespesa.busca(despesasList, t);
                    break;
                case 4:
                    AtualizaDespesa.atualizar(despesasList, t);
                    break;
                case 5:
                    ExcluirDespesa.excluir(despesasList, t);
                    break;
                case 6:
                    TotalDespesa.total(despesasList, t);
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
