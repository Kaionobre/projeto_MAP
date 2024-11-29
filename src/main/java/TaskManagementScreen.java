import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TaskManagementScreen extends JPanel {
    private List<Task> taskList;

    public TaskManagementScreen(MainFrame mainFrame, List<Task> taskList) {
        this.taskList = taskList;

        setLayout(null);

        JLabel titleLabel = new JLabel("Gerenciamento de Tarefas");
        titleLabel.setBounds(300, 20, 200, 30);
        add(titleLabel);

        // Botão para adicionar nova tarefa
        JButton addTaskButton = new JButton("Adicionar Tarefa");
        addTaskButton.setBounds(300, 60, 200, 30);
        add(addTaskButton);

        // Evento para adicionar tarefa
        addTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String taskTitle = JOptionPane.showInputDialog("Digite o título da tarefa:");
                if (taskTitle != null && !taskTitle.trim().isEmpty()) {
                    taskList.add(new Task(taskTitle));
                    JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");
                    mainFrame.showScreen(new TaskManagementScreen(mainFrame, taskList));
                }
            }
        });

        // Exibir tarefas e botões de ação
        int yPosition = 100;
        for (Task task : taskList) {
            JLabel taskLabel = new JLabel(task.getTitle() + " - Estado: " + task.getEstadoAtual());
            taskLabel.setBounds(50, yPosition, 400, 30);
            add(taskLabel);

            // Botão para concluir tarefa
            JButton completeButton = new JButton("Concluir");
            completeButton.setBounds(500, yPosition, 100, 30);
            add(completeButton);

            completeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    task.setEstado(new Concluido());
                    JOptionPane.showMessageDialog(null, "Tarefa marcada como concluída!");
                    mainFrame.showScreen(new TaskManagementScreen(mainFrame, taskList));
                }
            });

            // Botão para atrasar tarefa
            JButton delayButton = new JButton("Atrasar");
            delayButton.setBounds(610, yPosition, 100, 30);
            add(delayButton);

            delayButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    task.setEstado(new Atraso());
                    JOptionPane.showMessageDialog(null, "Tarefa marcada como atrasada!");
                    mainFrame.showScreen(new TaskManagementScreen(mainFrame, taskList));
                }
            });

            yPosition += 40; // Incrementa a posição para a próxima tarefa
        }
    }
}
