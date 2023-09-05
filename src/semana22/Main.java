package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/* JDBC - Conjunto de interfaces e classes para acesso a SGBDs
 *  Java app - reunirá as classes do JDBC, cujo usará um driver (biblioteca que implementa JDBC) para executar os comandos do SGBD
 * App desktop --> JDBC  --> Driver MySQL --> MySQL
 */

public class Main {
    public static void main(String[] args) throws SQLException {
        // 1. Abrir conexão
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);


        // 2. Executar a consulta e usar os resultados
        String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome VARCHAR(100), email VARCHAR(255), ativo BOOL);";
        Statement statement = connection.createStatement();
        statement.execute(sql);

        // 3. Fechar conexão
        statement.close();
        connection.close();

    }
}
