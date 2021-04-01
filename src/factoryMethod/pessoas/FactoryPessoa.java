package factoryMethod.pessoas;

public class FactoryPessoa {

	public PessoaAbstract getPessoa(String nome, String sexo) {

		PessoaAbstract nomePessoa = null;
		if (sexo.equals("M")) {
			nomePessoa = new Homem(nome);
		}
		if (sexo.equals("F")) {
			nomePessoa = new Mulher(nome);
		}
		return nomePessoa;
	}

}
