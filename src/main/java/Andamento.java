import java.util.Date;

public class Andamento implements Estado {
    private Date startDate;
    private String estado;
    private Date estimatedCompletion;
    private int progress;
    // Métodos getter e setter para encapsular os campos

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getEstado2() {
        return estado;
    }

    public void setEstado2(String estado) {
        this.estado = estado;
    }

    public Date getEstimatedCompletion() {
        return estimatedCompletion;
    }

    public void setEstimatedCompletion(Date estimatedCompletion) {
        this.estimatedCompletion = estimatedCompletion;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    @Override
    public String getEstado() {
        return "Em andamento";
    }
}