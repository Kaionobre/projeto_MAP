import java.util.Date;
import java.util.List;

public class Task {
    private Date data;
    private String conteudo;
    private List<String> tags;
    private Estado estadoAtual; // Estado atual da tarefa

    // Método para criar uma tarefa
    public void criarTask() {
        System.out.println("Tarefa criada com o estado inicial: Em andamento.");
        this.estadoAtual = new Andamento(); // Estado inicial padrão
    }

    // Método para finalizar uma tarefa
    public void finalizarTask() {
        System.out.println("Tarefa finalizada.");
        this.estadoAtual = new Concluido(); // Altera o estado para Concluído
    }

    // Método para alterar o estado da tarefa
    public void setEstado(Estado novoEstado) {
        System.out.println("Alterando estado da tarefa de " +
                (estadoAtual != null ? estadoAtual.getEstado() : "Nenhum") +
                " para " + novoEstado.getEstado());
        this.estadoAtual = novoEstado;
    }

    // Método para obter o estado atual da tarefa
    public String getEstadoAtual() {
        return estadoAtual != null ? estadoAtual.getEstado() : "Nenhum estado definido";
    }

    // Getters e setters para outros atributos, se necessário
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
