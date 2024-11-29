import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Time
        ScrumMaster scrumMaster = new ScrumMaster("Carlos", "senha123");
        Analista analista = new Analista("Ana", "senha456");
        PO po = new PO("João", "senha789");

        // Exibindo informações dos membros do time
        System.out.println("---- Membros do Time ----");
        System.out.println("Scrum Master: " + scrumMaster.getNome() + " - Cargo: " + scrumMaster.getCargo());
        System.out.println("Analista: " + analista.getNome() + " - Cargo: " + analista.getCargo());
        System.out.println("PO: " + po.getNome() + " - Cargo: " + po.getCargo());

        // Autenticando os membros
        System.out.println("\n---- Autenticação ----");
        scrumMaster.autenticar();
        analista.autenticar();
        po.autenticar();

        // Criando uma tarefa inicial
        Task task = new Task();
        task.criarTask(); // Inicializa a tarefa
        System.out.println("Estado inicial: " + task.getEstadoAtual());

        // Criando estados para a tarefa
        Estado emAndamento = new Andamento();
        Estado emAtraso = new Atraso();
        Estado concluido = new Concluido();

        // Simulando transições de estados por diferentes membros do time
        System.out.println("\n--- Transições de Estados ---");

        System.out.println(scrumMaster.getNome() + " muda o estado da tarefa para: Em atraso");
        task.setEstado(emAtraso);
        System.out.println("Estado atual: " + task.getEstadoAtual());

        System.out.println(analista.getNome() + " atualiza o estado da tarefa para: Em andamento");
        task.setEstado(emAndamento);
        System.out.println("Estado atual: " + task.getEstadoAtual());

        System.out.println(po.getNome() + " finaliza a tarefa, mudando o estado para: Concluído");
        task.setEstado(concluido);
        System.out.println("Estado atual: " + task.getEstadoAtual());

        // Criando listas de nomes e tags para a sprint
        List<String> nomesSprints = new ArrayList<>();
        nomesSprints.add("Sprint 1");
        nomesSprints.add("Sprint 2");

        List<String> tagsSprints = new ArrayList<>();
        tagsSprints.add("backend");
        tagsSprints.add("frontend");

        // Criando uma sprint
        Date dataSprint = new Date(); // Data atual
        Sprint sprint = new Sprint(nomesSprints, dataSprint, tagsSprints);

        // Exibindo as sprints por data
        System.out.println("\nExibindo Sprints pela data:");
        sprint.exibirPorData(dataSprint);

        // Exibindo as sprints por tag
        System.out.println("\nExibindo Sprints pela tag:");
        sprint.exibirPorTag("backend");

        // Tentativa de buscar por tag inexistente
        System.out.println("\nBuscando por uma tag inexistente:");
        sprint.exibirPorTag("mobile");
    }
}