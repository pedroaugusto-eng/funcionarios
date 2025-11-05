package funcionarios;

public class Aplicacao {
    public static void main(String[] args) {
        Funcionario[] func = new Funcionario[5];
        func[0] = new Gerente("Pedro", 100, 15000);
        func[1] = new Gerente("Caio", 100, 15000);
        func[2] = new Secretaria("Maria", 2, 10000);
        func[3] = new Secretaria("Cecilia", 4, 12000);
        func[4] = new Secretaria("Isabela", 5, 15000);

        System.out.println("\nFuncionários: ");
        for (int i = 0; i < func.length; i++) {
            System.out.println(func[i]);
        }

        System.out.println("\n... Aplicando aumento de 15% em todos ...\n");

        for (int i = 0; i < func.length; i++) {
            double valorDoAumento = func[i].getSalario() * 0.15; ;
            func[i].aumento(valorDoAumento);
        }

        System.out.println("\nFuncionários após o aumento: ");
        for (int i = 0; i < func.length; i++) {
            System.out.println(func[i]);
        }
    }
}
