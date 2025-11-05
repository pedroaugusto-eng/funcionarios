package funcionarios;

public class Secretaria extends Funcionario {
    private String nome;
    private double salario;
    private int qtdDepartamentos;

    public Secretaria(String nome, int qtdDepartamentos, double salario) {
        this.nome = nome;
        this.qtdDepartamentos = qtdDepartamentos;
        this.salario = salario;
    }

    public double getBonificacao() {
        return this.salario * 0.07;
    }

    public String toString() {
        return "\nNome: " + this.nome + "\nSalário R$: " + this.salario + "\nQuantidade de departamentos que atende: " + this.qtdDepartamentos + "\nBonificação: " + getBonificacao();
    }

    public double getSalario() {
        return this.salario;
    }

    public void aumento(double valor) {
        this.salario += valor;
    }

}
