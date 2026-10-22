
public class testfuncionario {
    public static void main(String[] args) {
        Ffuncionario funcionario =
                new funcionario("Pedro", 3000.00);

        Gerente gerente =
                new gerente("Ana", 5000.00, 1500.00);

        System.out.println("Salário funcionário: "
                + funcionario.calcularSalario());

        System.out.println("Salário gerente: "
                + gerente.calcularSalario());
    }
}
