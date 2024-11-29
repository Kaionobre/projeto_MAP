import javax.swing.*;

public class Screen {
    public Screen(){
        JFrame jframe = new JFrame();
        jframe.setVisible(true);
        jframe.setSize(800,500);
        jframe.setTitle("Projeto MAP");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Criando a janela usando o construtor da classe Screen
        new Screen();
    }
}
