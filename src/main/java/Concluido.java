import java.util.Date;

public class Concluido implements Estado {
    private Date dataConclusao;
    private String feedback;
    private boolean isAccept;

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public boolean isAccept() {
        return isAccept;
    }

    public void setAccept(boolean isAccept) {
        this.isAccept = isAccept;
    }

    @Override
    public String getEstado() {
        return "Concluído";
    }
}

