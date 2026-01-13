import models.*;
import java.util.Scanner;

public class Cadastrar {
    public static Usuario cadastrarUsuario() {
        Scanner t = new Scanner(System.in);
        Usuario user = new Usuario();
        user.nome = t.nextLine();
        user.cpf = t.nextLine();
        t.close();
        return user;
    }
}
