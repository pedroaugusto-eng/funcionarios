package funcionarios;

public class Gerente extends Funcionario {
    private String nome;
    private double salario;
    private int qtdPessoasGerenciadas;

    public Gerente(String nome, int qtdPessoasGerenciadas, double salario) {
        this.nome = nome;
        this.qtdPessoasGerenciadas = qtdPessoasGerenciadas;
        this.salario = salario;
    }

    public double getBonificacao() {
        return this.salario*0.10;
    }

    public String toString() {
        return "\nNome: " + this.nome + "\nSalário: R$: " + this.salario + "\nQuantidade de pessoas gerenciadas: " + this.qtdPessoasGerenciadas + "\nBonificação: " + getBonificacao();
    }

    public double getSalario() {
        return this.salario;
    }

    public void aumento(double valor) {
        this.salario += valor;
    }

}
