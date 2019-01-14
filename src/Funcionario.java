
public abstract class Funcionario {
	
	private final String nome;
	private final String sobrenome;
	private final String cpf;
	
	public Funcionario(String nome, String sobrenome, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}


	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return String.format("\nDados do funcionário:\nNome: %s %s\nCPF:%s\n",
				getNome(), getSobrenome(), getCpf());
	}
	
	public abstract double calculaGanhos();
}
