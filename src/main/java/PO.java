public class PO extends Time {
    public PO(String nome, String senha) {
        super(nome, senha, "PO");
    }

    @Override
    public boolean podeCriarTarefas() {
        return true; // PO pode criar tarefas
    }
}