import java.util.Date;

public class Pessoa {
    private String nome;
    private long cpf;
    private int telefone;
    private int data_nascimento;
    private int data_agendamento;
    private String período;


    public Pessoa(String nome, long cpf, int telefone, int data_nascimento, int data_agendamento, String período) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
        this.data_agendamento = data_agendamento;
        this.período = período;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", telefone=" + telefone +
                ", data_nascimento=" + data_nascimento +
                ", data_agendamento=" + data_agendamento +
                ", período='" + período + '\'' +
                '}';
    }
}
