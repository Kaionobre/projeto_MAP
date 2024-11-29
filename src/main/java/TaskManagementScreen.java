import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskManagementScreen extends JPanel {
    public TaskManagementScreen(MainFrame mainFrame) {
        setLayout(null);
        setBounds(0, 0, 800, 500);

        JLabel titleLabel = new JLabel("Gerenciamento de Tasks");
        titleLabel.setBounds(300, 20, 200, 30);
        add(titleLabel);

        // Botão para adicionar uma nova task
        JButton addTaskButton = new JButton("Adicionar Task");
        addTaskButton.setBounds(300, 60, 200, 30);
        add(addTaskButton);

        // Adicionar evento para o botão "Adicionar Task"
        addTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String taskTitle = JOptionPane.showInputDialog("Digite o título da Task:");
                if (taskTitle != null && !taskTitle.trim().isEmpty()) {
                    Task newTask = new Task(taskTitle);
                    TaskManager.addTask(newTask); // Adiciona ao gerenciador
                    JOptionPane.showMessageDialog(null, "Task adicionada com sucesso!");
                    mainFrame.showScreen(new TaskManagementScreen(mainFrame));
                } else {
                    JOptionPane.showMessageDialog(null, "O título da Task não pode estar vazio.");
                }
            }
        });

        // Listar tasks existentes
        int yPosition = 100;
        for (Task task : TaskManager.getTasks()) { // Obtém tasks do gerenciador
            JLabel taskLabel = new JLabel(task.getTitle() + " - Status: " + task.getStatus());
            taskLabel.setBounds(300, yPosition, 300, 30);
            add(taskLabel);

            JButton completeButton = new JButton("Concluir");
            completeButton.setBounds(600, yPosition, 100, 30);
            add(completeButton);

            // Evento para alterar o status para "Concluído"
            completeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    task.setEstado(new Concluido());
                    JOptionPane.showMessageDialog(null, "Task marcada como concluída!");
                    mainFrame.showScreen(new TaskManagementScreen(mainFrame));
                }
            });

            yPosition += 40; // Incrementa a posição vertical
        }
    }
}
