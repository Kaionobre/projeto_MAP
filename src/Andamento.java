import java.util.Date;

public class Andamento implements Estado {
    private Date startDate;
    private String estado;
    private Date estimatedCompletion;
    private int progress;

    @Override
    public String getEstado() {
        return "Em andamento";
    }
}
