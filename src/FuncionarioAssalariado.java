
public class FuncionarioAssalariado extends Funcionario{
	
	private double salarioSemanal;

	public FuncionarioAssalariado(String nome, String sobrenome, String cpf, double salarioSemanal) {
		super(nome, sobrenome, cpf);
		
		if(salarioSemanal < 0) {
			
			throw new IllegalArgumentException("Salário deve ser >= 0");
			
		}
		
		this.salarioSemanal = salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		
		if(salarioSemanal < 0) {
			
			throw new IllegalArgumentException("Salário deve ser >= 0");
			
		}
		
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public String toString() {
		return String.format("Funcionario assalariado : %s%s: $%,.2f", super.toString(), "Salario Semanal", getSalarioSemanal());
	}

	@Override
	public double calculaGanhos() {
		return getSalarioSemanal();
	}
	
	
}
