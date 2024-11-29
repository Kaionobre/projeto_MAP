public class Task {
    private String title;
    private Estado estadoAtual;

    public Task(String title) {
        this.title = title;
        this.estadoAtual = new Andamento(); // Estado inicial
    }

    public String getTitle() {
        return title;
    }

    public Estado getEstadoAtual() {
        return estadoAtual; // Corrigido para retornar o estadoAtual
    }

    public void setEstado(Estado novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public String getStatus() {
        return estadoAtual.getEstado(); // Retorna o estado como string
    }
}
