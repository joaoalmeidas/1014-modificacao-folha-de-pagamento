
public class FuncionarioPeca extends Funcionario{


	private int pecas;
	private double salarioPorPeca;
	
	public FuncionarioPeca(String nome, String sobrenome, String cpf, int pecas, double salarioPorPeca) {
		super(nome, sobrenome, cpf);
		
		if(pecas < 0) {
			
			throw new IllegalArgumentException("pecas deve ser >= 0");
			
		}
		
		if(salarioPorPeca < 0) {
			
			throw new IllegalArgumentException("salarioPorPeca deve ser >= 0");
			
		}
		
		this.pecas = pecas;
		this.salarioPorPeca = salarioPorPeca;
		
	}

	public int getPecas() {
		return pecas;
	}

	public void setPecas(int pecas) {
		this.pecas = pecas;
	}

	public double getSalarioPorPeca() {
		return salarioPorPeca;
	}

	public void setSalarioPorPeca(double salarioPorPeca) {
		this.salarioPorPeca = salarioPorPeca;
	}

	@Override
	public double calculaGanhos() {
		return pecas * salarioPorPeca;
	}

	@Override
	public String toString() {
		return String.format("Funcionario Peça : %s"
				+ "%s$%,.2f%n"
				+ "%s%d%n"
				+ "%s$%,.2f", 
				super.toString(), 
				"Salario Por Peça: ", getSalarioPorPeca(),
				"Peças produzidas: ", getPecas(),
				"Salario: ", calculaGanhos());
	}
	
	
	
	
	
	
	

}
