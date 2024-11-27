import java.util.Date;

public class Atraso implements Estado {
    private Date deadLine;
    private String relatorio;

    @Override
    public String getEstado() {
        return "Em atraso";
    }
}
