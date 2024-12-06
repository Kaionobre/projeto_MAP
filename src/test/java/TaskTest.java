import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void testCriacaoETransicaoDeEstado() {
        // Cria uma nova tarefa
        Task task = new Task();

        // Cria a tarefa e define seu estado inicial como "Em andamento"
        task.criarTask();

        // Verifica se o estado inicial é 'Em andamento'
        assertEquals("Em andamento", task.getEstadoAtual(), "O estado inicial da tarefa deve ser 'Em andamento'.");

        // Muda o estado da tarefa para "Concluído"
        task.finalizarTask();

        // Verifica se o estado da tarefa é agora "Concluído"
        assertEquals("Concluído", task.getEstadoAtual(), "O estado da tarefa após finalizar deve ser 'Concluído'.");
    }
}
