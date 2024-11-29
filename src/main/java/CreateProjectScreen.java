import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateProjectScreen extends JPanel {
    public CreateProjectScreen(MainFrame mainFrame) {
        setLayout(null);
        setBounds(0, 0, 800, 500);

        JLabel titleLabel = new JLabel("Criar Novo Projeto");
        titleLabel.setBounds(300, 50, 200, 30);
        add(titleLabel);

        JLabel nameLabel = new JLabel("Nome do Projeto:");
        nameLabel.setBounds(200, 100, 150, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(350, 100, 200, 30);
        add(nameField);

        JButton createButton = new JButton("Criar");
        createButton.setBounds(300, 200, 200, 30);
        add(createButton);

        JButton backButton = new JButton("Voltar");
        backButton.setBounds(300, 250, 200, 30);
        add(backButton);

        // Evento para criar o projeto
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String projectName = nameField.getText();
                if (!projectName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Projeto " + projectName + " criado com sucesso!");
                    mainFrame.showScreen(new ProjectManagementScreen(mainFrame));
                } else {
                    JOptionPane.showMessageDialog(null, "Digite um nome para o projeto!");
                }
            }
        });

        // Evento para voltar
        backButton.addActionListener(e -> mainFrame.showScreen(new HomeScreen(mainFrame)));
    }
}
