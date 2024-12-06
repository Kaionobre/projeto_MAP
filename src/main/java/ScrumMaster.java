public class ScrumMaster extends Time {
    public ScrumMaster(String nome, String senha) {
        super(nome, senha, "Scrum");
    }

    @Override
    public boolean podeCriarTarefas() {
        return true; // Scrum também pode criar tarefas
    }
}