import java.util.ArrayList;

class Desenvolvedor extends Funcionario {
    private double salarioBase;
    private int horasTrabalhadas;
    private ArrayList<String> tecnologiasDominadas;

    public Desenvolvedor(String nome, String matricula, double salarioBase, int horasTrabalhadas) {
        super(nome, matricula);
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.tecnologiasDominadas = new ArrayList<>();
    }

    
    public void adicionarTecnologia(String tecnologia) {
        tecnologiasDominadas.add(tecnologia);
    }

    @Override
    public double calcularSalario() {
        
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Matrícula: " + getMatricula() + ", Tecnologias Dominadas: " + tecnologiasDominadas;
    }
}
