
public class FolhaDePagamentoTeste {

	public static void main(String[] args) {


		FuncionarioAssalariado funassalariado = new FuncionarioAssalariado("João", "Almeida", "12524566812", 2000);
		FuncionarioHorario funhorario = new FuncionarioHorario("Maria", "Silveira", "51645422345", 40, 25);
		FuncionarioComissionado funcomissionado = new FuncionarioComissionado("Mariana", "Freitas", "12254568754", 500000, .05);
		FuncionarioBaseMaisComissao funbase = new FuncionarioBaseMaisComissao("Jorge", "Wilstermann", "12354648454", 500000, .05, 500);
		
		System.out.println("Salarios do funcionários processados individualmente:");
		
		System.out.printf("%n%s%n%s: %,.2f%n%n", funassalariado, "recebeu", funassalariado.calculaGanhos());
		
		System.out.printf("%n%s%n%s: %,.2f%n%n", funhorario, "recebeu", funhorario.calculaGanhos());
		
		System.out.printf("%n%s%n%s: %,.2f%n%n", funcomissionado, "recebeu", funcomissionado.calculaGanhos());
		
		System.out.printf("%n%s%n%s: %,.2f%n%n", funbase, "recebeu", funbase.calculaGanhos());
		
		Funcionario[] funcionarios = new Funcionario[4];
		
		funcionarios[0] = funassalariado;
		funcionarios[1] = funhorario;
		funcionarios[2] = funcomissionado;
		funcionarios[3] = funbase;
		
		System.out.println("Salarios do funcionários processados polimorficamente:");
		
		for(Funcionario funcionarioAtual: funcionarios) {
			
			System.out.println(funcionarioAtual);
			
			if(funcionarioAtual instanceof FuncionarioBaseMaisComissao) {
				
				FuncionarioBaseMaisComissao funcionario = (FuncionarioBaseMaisComissao) funcionarioAtual;
				
				funcionario.setSalarioBase(1.10 * funcionario.getSalarioBase());
				
				System.out.printf("Novo salário base com o aumento de 10%%: %,.2f%n", funcionario.getSalarioBase());
				
			}
			
			System.out.printf("recebeu %,.2f%n%n", funcionarioAtual.calculaGanhos());
		}
		
		for(int i = 0; i < funcionarios.length; i++) {
			System.out.printf("Funcionário %d é um %s%n", i, funcionarios[i].getClass().getName());
		}

	}

}
