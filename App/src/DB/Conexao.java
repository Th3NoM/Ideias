package DB;
import java.sql.*;
/**
 *
 * @author bruno
 */
public class Conexao {
    
    Connection conn = null;
    
    public Connection conexaoDb() throws SQLException {
    
        String url, user, password;
        
        // você pode alterar a schema, user ou senha de acordo com o que achar necessário
        // só não esqueça de fazer as alterações em Controllers.UsuarioControle
        url = "jdbc:mysql://localhost:3306/java";
        user = "root";
        password = "";
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            if (conn != null) {
                System.out.println("Conexão estabelecida!");  
            } 
            
        } catch (SQLException e) {
            System.out.println("Erro ao se conectar: " + e.getMessage());
        }
        return conn;
    }
    
}
