
public class FuncionarioHorario extends Funcionario {
	
	private double horas;
	private double salarioHora;
	
	
	public FuncionarioHorario(String nome, String sobrenome, String cpf, double horas, double salarioHora) {
		super(nome, sobrenome, cpf);
		
		if(horas < 0 || horas > 168) {
			
			throw new IllegalArgumentException("Horas precisa estar entre 0 e 168");
			
		}
		
		if(salarioHora < 0) {
			
			throw new IllegalArgumentException("Salario precisa ser > 0");
			
		}
			
		this.horas = horas;
		this.salarioHora = salarioHora;
	}


	public double getHoras() {
		return horas;
	}


	public void setHoras(double horas) {
		
		if(horas < 0 || horas > 168) {
			
			throw new IllegalArgumentException("Horas precisa estar entre 0 e 168");
			
		}
		
		this.horas = horas;
	}


	public double getSalarioHora() {
		return salarioHora;
	}


	public void setSalarioHora(double salarioHora) {
		
		if(salarioHora < 0) {
			
			throw new IllegalArgumentException("Salario precisa ser > 0");
			
		}
		
		this.salarioHora = salarioHora;
	}


	@Override
	public String toString() {

		return String.format("Funcionario Hora: %s%s: %,.2f%n%s: %,.2f", super.toString(), 
				"Horas trabalhadas: ", getHoras(), "Salario por Hora: ", getSalarioHora());
		
	}


	@Override
	public double calculaGanhos() {
		
		if(getHoras() <= 40) {
			
			return getHoras() * getSalarioHora();
			
		}else {
			
			return 40 * getSalarioHora() + (getHoras() - 40) * getSalarioHora() * 1.5;
			
		}
		
	}
	
	
	
	
	
}
