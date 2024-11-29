import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Gerenciador de Projetos");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        showScreen(new TaskManagementScreen(this)); // Inicializa na tela de gerenciamento de tasks
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
