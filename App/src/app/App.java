// Este é apenas um exemplo para utilização de banco de dados, para fazer
// um registro e login de usuários, contendo criptografia simples de senha,
// e a autenticação do usuário.

package app;
import Views.LoginRegistro;
import javax.swing.SwingUtilities;

/**
 *
 * @author bruno
 */
public class App {

    public static void main(String[] args) {
        
        //iniciamos pela jframe login/registro
        SwingUtilities.invokeLater(() -> {
            new LoginRegistro().setVisible(true);
        });
        
    }
    
}
