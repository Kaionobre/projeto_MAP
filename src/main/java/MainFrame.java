import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {
    // Lista global para armazenar as tasks
    private List<Task> taskList;

    public MainFrame() {
        setTitle("Gerenciador de Projetos");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Inicializa a lista de tarefas
        this.taskList = new ArrayList<>();
        this.taskList.add(new Task("Tarefa Inicial")); // Adicionando uma tarefa inicial

        // Passa a lista de tarefas para o TaskManagementScreen
        showScreen(new TaskManagementScreen(this, taskList));
    }

    public void showScreen(JPanel panel) {
        getContentPane().removeAll();
        getContentPane().add(panel);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }
}
