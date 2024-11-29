import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectDetailsScreen extends JPanel {
    public ProjectDetailsScreen(MainFrame mainFrame, String projectName) {
        // Configuração do painel
        setLayout(null);
        setBounds(0, 0, 800, 500);

        JLabel titleLabel = new JLabel("Detalhes do Projeto: " + projectName);
        titleLabel.setBounds(300, 50, 300, 30);
        add(titleLabel);

        // Simulando detalhes do projeto
        JLabel detailsLabel = new JLabel("Detalhes do projeto " + projectName + " aqui.");
        detailsLabel.setBounds(300, 150, 300, 30);
        add(detailsLabel);

        JButton backButton = new JButton("Voltar");
        backButton.setBounds(300, 300, 200, 30);
        add(backButton);

        // Evento para voltar
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.showScreen(new ProjectManagementScreen(mainFrame));
            }
        });
    }
}
