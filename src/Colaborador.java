import java.util.Objects;

/** Colaborador da Xulambs Data. Classe abstrata da hierarquia de remuneração. */
public abstract class Colaborador {
    private String nome;
    private String registro;
    protected double ultimoPagamento;

    protected Colaborador(String nome, String registro) {
        this.nome = nome;
        this.registro = registro;
        this.ultimoPagamento = 0.0;
    }

    public String getNome() { return nome; }
    public String getRegistro() { return registro; }
    public double getUltimoPagamento() { return ultimoPagamento; }

    /** Calcula e registra o pagamento; deve armazenar em {@code ultimoPagamento}. */
    public abstract double registrarPagamento();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Colaborador outro)) return false;
        return Objects.equals(registro, outro.registro);
    }

    @Override
    public int hashCode() { return Objects.hash(registro); }

    @Override
    public String toString() {
        return nome + " (" + registro + ") | ultimoPagamento=" + String.format("%.2f", ultimoPagamento);
    }
}
