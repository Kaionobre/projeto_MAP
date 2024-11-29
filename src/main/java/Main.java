import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista global de tarefas
        List<Task> taskList = new ArrayList<>();

        // Adicionando uma tarefa inicial para simular o fluxo
        Task task = new Task("Minha Tarefa Inicial");
        taskList.add(task);

        // Criando estados para testes no console
        Estado emAndamento = new Andamento();
        Estado emAtraso = new Atraso();
        Estado concluido = new Concluido();

        // Exibindo estado inicial no console
        System.out.println("Título da Tarefa: " + task.getTitle());
        System.out.println("Estado inicial: " + task.getEstadoAtual());

        // Simulando transições
        task.setEstado(emAndamento);
        System.out.println("Atualizado para: " + task.getEstadoAtual());

        task.setEstado(emAtraso);
        System.out.println("Atualizado para: " + task.getEstadoAtual());

        task.setEstado(concluido);
        System.out.println("Atualizado para: " + task.getEstadoAtual());

        // Criando o frame principal e mostrando a tela de gerenciamento de tarefas
        MainFrame mainFrame = new MainFrame();
        mainFrame.showScreen(new TaskManagementScreen(mainFrame, taskList));
    }
}
