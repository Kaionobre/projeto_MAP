public class Time {
    protected String nome;
    protected String senha;
    protected String cargo;

    public Time(String nome, String senha, String cargo) {
        this.nome = nome;
        this.senha = senha;
        this.cargo = cargo;
    }

    public void autenticar() {
        System.out.println("Autenticando " + nome + " com o cargo de " + cargo + "...");
        // Implementar lógica de autenticação
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
}
