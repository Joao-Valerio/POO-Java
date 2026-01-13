import java.util.ArrayList;

import models.Usuario;

public class Listar {
    public static void listUsuario(ArrayList<Usuario> usersList) {
        if (usersList.isEmpty()) {
            System.out.println("Sem usuarios cadastrados");
        }
        else{
            for(Usuario user : usersList){
                System.out.println("Nome: " + user.nome + " | CPF: " + user.cpf);
            }
        }
    }
}
