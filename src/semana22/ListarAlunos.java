package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarAlunos {
    public static void main(String[] args) throws SQLException {
        // 1. Abrir conexão
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        // 2. Buscar todos os alunos
        String sql = "SELECT * FROM alunos;";
        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery(sql);
        
        while (rs.next()){
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");

            System.out.println(id + ", " + nome + ", " + email + ", " + ativo);
        } 

        // 3. Fechar conexão
        statement.close();
        connection.close();
    }
}

// *NOTAS*
//precisa usar valores = prepared. não precisa usar valores = statement
