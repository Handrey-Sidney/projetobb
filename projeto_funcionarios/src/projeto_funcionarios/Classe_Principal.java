package projeto_funcionarios;

public class Classe_Principal {

	public static void main(String[] args) {
		
		ClasseFuncionarios funcionario = new ClasseFuncionarios();
		funcionario.setAtributoIdFuncionario(1);
		funcionario.setAtributoNomeFuncionario("Hnadrey ");
		funcionario.setAtributoRendaFuncionario(8.5);
		
		ClasseInsertSQL sql = new ClasseInsertSQL();
		sql.salvarDados(funcionario);

	}

}
