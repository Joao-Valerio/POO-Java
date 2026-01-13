import java.util.ArrayList;
import java.util.Scanner;
import models.Usuario;

public class Atualizar {
    public static void atualizarUsuario(ArrayList<Usuario> usersList) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o CPF do usuário a ser atualizado: ");
        String cpf = t.nextLine();
        boolean encontrado = false;
        for (Usuario user : usersList) {
            if (user.cpf.equals(cpf)) {
                System.out.println("Usuário encontrado: Nome: " + user.nome + " | CPF: " + user.cpf);
                System.out.print("Digite o novo nome: ");
                user.nome = t.nextLine();
                System.out.print("Digite o novo CPF: ");
                user.cpf = t.nextLine();
                System.out.println("Usuário editado com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Usuário com CPF " + cpf + " não encontrado.");
        }
        t.close();
    }
}
