package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeletarAluno {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o ID do aluno que deseja deletar:");
        int id = scanner.nextInt();
        
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true", "estudante", "estudante")) {
            String sql = "DELETE FROM alunos WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            
            int rowsDeleted = preparedStatement.executeUpdate();
            
            if (rowsDeleted > 0) {
                System.out.println("Aluno deletado com sucesso.");
            } else {
                System.out.println("Nenhum aluno encontrado com o ID informado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
