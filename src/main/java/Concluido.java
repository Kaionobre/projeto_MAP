import java.util.Date;

public class Concluido implements Estado {
    private Date dataConclusao;
    private String feedback;
    private boolean isAccept;

    @Override
    public String getEstado() {
        return "Concluído";
    }
}