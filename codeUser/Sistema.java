import java.util.Scanner;
import java.util.ArrayList;
import models.Usuario;

public class Sistema {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        ArrayList<Usuario> usersList = new ArrayList<>();
        while (true) {
            System.out.println("==== MENU ====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Excluir usuário");
            System.out.println("4 - Atualizar usuário");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = t.nextInt();
            t.close();
            switch (escolha) {
                case 1:
                    Usuario user = Cadastrar.cadastrarUsuario();
                    usersList.add(user);
                    break;
                case 2:
                    Listar.listUsuario(usersList);
                    break;
                case 3:
                    Excluir.excluirUsuarios(usersList);
                case 4:
                    Atualizar.atualizarUsuario(usersList);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        
    }
}