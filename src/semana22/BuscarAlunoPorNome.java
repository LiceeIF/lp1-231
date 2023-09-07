package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BuscarAlunoPorNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do aluno:");
        String nome = scanner.nextLine();
        
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true", "estudante", "estudante")) {
            String sql = "SELECT * FROM alunos WHERE nome = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nome);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                int alunoId = resultSet.getInt("id");
                String alunoNome = resultSet.getString("nome");
                String email = resultSet.getString("email");
                boolean ativo = resultSet.getBoolean("ativo");
                
                System.out.println("ID: " + alunoId);
                System.out.println("Nome: " + alunoNome);
                System.out.println("Email: " + email);
                System.out.println("Ativo: " + ativo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}