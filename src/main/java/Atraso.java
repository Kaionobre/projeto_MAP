import java.util.Date;

public class Atraso implements Estado {
    private Date deadLine;
    private String relatorio;

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String getEstado() {
        return "Em atraso";
    }
}