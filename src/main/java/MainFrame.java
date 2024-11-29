import javax.swing.*;

public class MainFrame {
    private JFrame frame; // Janela principal

    public MainFrame() {
        // Configurando a janela principal
        frame = new JFrame("Projeto MAP");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Sem layout automático
        frame.setVisible(true);

        // Mostrando a tela inicial
        showScreen(new HomeScreen(this));
    }

    public void showScreen(JPanel panel) {
        frame.getContentPane().removeAll(); // Remove a tela anterior
        frame.getContentPane().add(panel); // Adiciona a nova tela
        frame.revalidate(); // Revalida o layout
        frame.repaint(); // Atualiza a interface
    }

    public static void main(String[] args) {
        new MainFrame(); // Inicializa o programa
    }
}
