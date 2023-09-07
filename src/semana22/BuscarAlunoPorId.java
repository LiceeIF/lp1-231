package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuscarAlunoPorId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o ID do aluno:");
        int id = scanner.nextInt();
        
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true", "estudante", "estudante")) {
            String sql = "SELECT * FROM alunos WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                int alunoId = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String email = resultSet.getString("email");
                boolean ativo = resultSet.getBoolean("ativo");
                
                System.out.println("ID: " + alunoId);
                System.out.println("Nome: " + nome);
                System.out.println("Email: " + email);
                System.out.println("Ativo: " + ativo);
            } else {
                System.out.println("Aluno não encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}