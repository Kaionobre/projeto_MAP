import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectManagementScreen extends JPanel {
    public ProjectManagementScreen(MainFrame mainFrame) {
        setLayout(null);
        setBounds(0, 0, 800, 500);

        JLabel titleLabel = new JLabel("Gerenciar Projetos");
        titleLabel.setBounds(300, 50, 200, 30);
        add(titleLabel);

        // Simulação de projetos
        String[] projects = {"Projeto 1", "Projeto 2", "Projeto 3"};
        JList<String> projectList = new JList<>(projects);
        projectList.setBounds(300, 100, 200, 150);
        add(projectList);

        JButton viewDetailsButton = new JButton("Ver Detalhes");
        viewDetailsButton.setBounds(300, 300, 200, 30);
        add(viewDetailsButton);

        JButton backButton = new JButton("Voltar");
        backButton.setBounds(300, 350, 200, 30);
        add(backButton);

        // Evento para ver detalhes
        viewDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedProject = projectList.getSelectedValue();
                if (selectedProject != null) {
                    mainFrame.showScreen(new ProjectDetailsScreen(mainFrame, selectedProject));
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione um projeto!");
                }
            }
        });

        // Evento para voltar
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.showScreen(new HomeScreen(mainFrame));
            }
        });
    }
}
