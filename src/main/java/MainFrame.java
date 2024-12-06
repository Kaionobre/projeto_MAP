import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {
    private List<Task> taskList;
    private Time time; // Usando Time, que pode ser PO, Scrum ou Analista

    public MainFrame() {
        setTitle("Gerenciador de Projetos");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Inicializa a lista de tarefas
        this.taskList = new ArrayList<>();
        this.taskList.add(new Task("Tarefa Inicial")); // Adicionando uma tarefa inicial

        // Solicita o nome, senha e cargo do usuário
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String senha = JOptionPane.showInputDialog("Digite sua senha:");
        String cargo = (String) JOptionPane.showInputDialog(null, "Escolha seu cargo:", "Seleção de Cargo", JOptionPane.QUESTION_MESSAGE, null, new String[]{"PO (Product Owner)", "Scrum", "Analista"}, "PO (Product Owner)");

        // Cria o objeto Time com base no cargo selecionado
        if (cargo.equals("PO (Product Owner)")) {
            time = new PO(nome, senha);
        } else if (cargo.equals("Scrum")) {
            time = new ScrumMaster(nome, senha);
        } else {
            time = new Analista(nome, senha);
        }

        // Passa a lista de tarefas e o time para o TaskManagementScreen
        showScreen(new TaskManagementScreen(this, taskList, time)); // Passando os três parâmetros
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
