import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskIntegrationTest {

    @Test
    public void testCriacaoEAlteracaoDeEstado() {
        // Criando uma instância da tarefa
        Task task = new Task();

        // Criando a tarefa e verificando o estado inicial
        task.criarTask(); // Criação da tarefa
        assertEquals("Em andamento", task.getEstadoAtual(), "O estado inicial da tarefa deve ser 'Em andamento'.");

        // Alterando o estado para "Em atraso"
        Estado emAtraso = new Atraso();
        task.setEstado(emAtraso); // Alterando o estado para "Em atraso"
        assertEquals("Em atraso", task.getEstadoAtual(), "O estado da tarefa deveria ser 'Em atraso' após a transição.");

        // Alterando o estado para "Concluído"
        Estado concluido = new Concluido();
        task.setEstado(concluido); // Alterando o estado para "Concluído"
        assertEquals("Concluído", task.getEstadoAtual(), "O estado da tarefa deveria ser 'Concluído' após a transição.");
    }
}
