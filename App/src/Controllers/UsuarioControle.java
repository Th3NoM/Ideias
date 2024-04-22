package Controllers;
import java.sql.*;
import Models.Usuario;
import DB.Conexao;
import java.awt.HeadlessException;
import java.util.Base64;
/**
 *
 * @author bruno
 */
public class UsuarioControle {
    
    Connection conn = null;
    
    public ResultSet registrarUsuario(Usuario usuario) {
    
        conn = new Conexao().conexaoDb();

        String nome, senha, email, sql;
        
        // instanciar as informações do usuário para depois poder inserir-las com o 'set'
        nome = usuario.getNome();
        senha = usuario.getSenha();
        email = usuario.getEmail();
        
        //criptografar a senha com base64
        String criptografar = Base64.getEncoder().encodeToString(senha.getBytes());
        
        // inserindo valores no banco de dados
        // lembrando de armazenar a senha criptografada
        sql = "INSERT INTO java.usuario"
                + " (nome, senha, email)"
                + " VALUES"
                + " ('" + nome + "',"
                + " '" + criptografar + "',"
                + " '" + email + "')";
        
        try {
            // inicia um statment para as instruções SQL
            Statement pts = conn.createStatement();
            pts.executeUpdate(sql);
            
            usuario.setNome(nome);
            
            // *iremos inserir a senha criptografada apenas no banco de dados
            usuario.setSenha(senha);
            usuario.setEmail(email);
            
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao registrar usuário: " + e.getMessage());
        }
        return null;
    }
    
    public ResultSet autenticacao(Usuario usuario) {
    
        conn = new Conexao().conexaoDb();

        String nome, senha,query;

        nome = usuario.getNome();
        senha = usuario.getSenha();
        
        //criptografar a senha com base64 novamente para poder fazer a verificação
        //já criptografada, senão a senha não estará correta
        String criptografar = Base64.getEncoder().encodeToString(senha.getBytes());
        
        query = "SELECT * FROM java.usuario WHERE nome = ? AND senha = ?";
        
        try {
            // preparedStatment para instruções SQL de verificação de dados
            // assim podendo autenticar um usuário
            PreparedStatement pts = conn.prepareStatement(query);
            
            // as pocições de indices são de acordo à instrução sql descrita, assim como na linha 64,
            // onte indice 1 refere à nome e indice 2 à senha. Atenção para essa instrução
            // pois pode ocorrer um erro tanto de syntax quanto de valores fora do tamanho de indice 
            pts.setString(1, nome);
            pts.setString(2, criptografar);
            
            ResultSet rs = pts.executeQuery();
            return rs;
            
        } catch (HeadlessException | SQLException e) {
            System.out.println("Ocorreu um erro na verificação de usuário: " + e.getMessage());
        }
        return null;
    }
    
}
