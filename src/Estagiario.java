
class Estagiario extends Funcionario {
    private int horasTrabalhadas;
    private String supervisor;

    public Estagiario(String nome, String matricula, int horasTrabalhadas, String supervisor) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.supervisor = supervisor;
    }

    
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    
    public String getSupervisor() {
        return supervisor;
    }

    
    @Override
    public double calcularSalario() {
        
        return horasTrabalhadas * 10; 
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Matrícula: " + getMatricula() + ", Supervisor: " + supervisor + ", Salário: " + calcularSalario();
    }
}
