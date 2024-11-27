import java.util.Date;
import java.util.List;

public class Sprint {
    private List<String> nome;
    private Date data;
    private List<String> tag;

    public Sprint(List<String> nome, Date data, List<String> tag) {
        this.nome = nome;
        this.data = data;
        this.tag = tag;
    }

    // Método para exibir nomes associados a uma data específica
    public void exibirPorData(Date dataBusca) {
        if (this.data.equals(dataBusca)) {
            System.out.println("Sprints na data " + dataBusca + ":");
            for (String nomeSprint : nome) {
                System.out.println("- " + nomeSprint);
            }
        } else {
            System.out.println("Nenhuma Sprint encontrada na data: " + dataBusca);
        }
    }

    // Método para exibir sprints associadas a uma tag específica
    public void exibirPorTag(String tagBusca) {
        if (tag.contains(tagBusca)) {
            System.out.println("Sprints com a tag '" + tagBusca + "':");
            for (String nomeSprint : nome) {
                System.out.println("- " + nomeSprint);
            }
        } else {
            System.out.println("Nenhuma Sprint encontrada com a tag: " + tagBusca);
        }
    }

    // Getters e Setters
    public List<String> getNome() {
        return nome;
    }

    public void setNome(List<String> nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }
}
