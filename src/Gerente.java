import java.util.ArrayList;

class Gerente extends Funcionario {
    private double salarioBase;
    private double bonusAnual;
    private ArrayList<Funcionario> equipe;

    public Gerente(String nome, String matricula, double salarioBase, double bonusAnual) {
        super(nome, matricula);
        this.salarioBase = salarioBase;
        this.bonusAnual = bonusAnual;
        this.equipe = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        equipe.add(funcionario);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusAnual;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Matrícula: " + getMatricula() + ", Salário Total: " + calcularSalario();
    }
}
