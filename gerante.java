
public class gerente extends funcionario {
    private double bonus;

    public gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salario + bonus;
    }
}
