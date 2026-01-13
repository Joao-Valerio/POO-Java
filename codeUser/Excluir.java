import java.util.Scanner;
import java.util.ArrayList;
import models.Usuario;

public class Excluir {
    public static void excluirUsuarios(ArrayList<Usuario> usersList) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o CPF do usuário a ser excluído: ");
        String cpfBusca = t.nextLine();
        boolean encontrado = false;
        for(int c = 0;c<usersList.size();c++){
            if (usersList.get(c).cpf.equals(cpfBusca)) {
                usersList.remove(c);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
          System.out.println("Usuário com CPF " + cpfBusca + " não encontrado.");  
        }
        t.close();
    }
}
