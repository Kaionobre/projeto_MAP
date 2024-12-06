public class Analista extends Time {
    public Analista(String nome, String senha) {
        super(nome, senha, "Analista");
    }

    @Override
    public boolean podeCriarTarefas() {
        return false; // Analista só pode ver as tarefas
    }
}