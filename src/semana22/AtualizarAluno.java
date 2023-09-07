package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AtualizarAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o ID do aluno que deseja atualizar:");
        int id = scanner.nextInt();
        
        System.out.println("Informe o novo nome do aluno:");
        scanner.nextLine(); // Consumir a quebra de linha
        String nome = scanner.nextLine();
        
        System.out.println("Informe o novo email do aluno:");
        String email = scanner.nextLine();
        
        System.out.println("Informe se o aluno está ativo (true/false):");
        boolean ativo = scanner.nextBoolean();
        
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true", "estudante", "estudante")) {
            String sql = "UPDATE alunos SET nome = ?, email = ?, ativo = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, email);
            preparedStatement.setBoolean(3, ativo);
            preparedStatement.setInt(4, id);
            
            int rowsUpdated = preparedStatement.executeUpdate();
            
            if (rowsUpdated > 0) {
                System.out.println("O aluno foi atualizado com sucesso!");
            } else {
                System.out.println("Não foi encontrado um aluno com o ID fornecido.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
