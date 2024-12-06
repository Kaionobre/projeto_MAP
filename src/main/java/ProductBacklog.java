import java.util.Date;
import java.util.List;

public class ProductBacklog {
    private Date data;
    private String conteudo;
    private List<String> tags;
    private List<String> estado;

    // Encapsulate Field
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

    public List<String> getEstado() {
        return estado;
    }

    public void setEstado(List<String> estado) {
        this.estado = estado;
    }

    // salvar o backlog
    public void salvar() {
        if (validarDados()) {  // Chama o método de validação
            System.out.println("Salvando o backlog...");
        } else {
            System.out.println("Dados inválidos para salvar o backlog.");
        }
    }

    // Extract Method
    private boolean validarDados() {
        // Verifica se o conteúdo e o estado são válidos
        return conteudo != null && !conteudo.isEmpty() && estado != null && !estado.isEmpty();
    }
}
