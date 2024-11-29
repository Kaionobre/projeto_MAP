import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JPanel {
    public HomeScreen(MainFrame mainFrame) {
        // Configuração do painel
        setLayout(null);
        setBounds(0, 0, 800, 500);

        // Mensagem de boas-vindas
        JLabel welcomeLabel = new JLabel("Bem-vindo ao Projeto MAP!");
        welcomeLabel.setBounds(300, 100, 200, 30);
        add(welcomeLabel);

        // Botão para gerenciar projetos
        JButton manageProjectsButton = new JButton("Gerenciar Projetos");
        manageProjectsButton.setBounds(300, 200, 200, 30);
        add(manageProjectsButton);

        // Botão para criar novos projetos
        JButton createProjectButton = new JButton("Criar Novo Projeto");
        createProjectButton.setBounds(300, 250, 200, 30);
        add(createProjectButton);

        // Ação para o botão de gerenciar projetos
        manageProjectsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.showScreen(new ProjectManagementScreen(mainFrame));
            }
        });

        // Ação para o botão de criar projetos
        createProjectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.showScreen(new CreateProjectScreen(mainFrame));
            }
        });
    }
}
