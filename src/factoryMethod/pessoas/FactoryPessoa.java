package factoryMethod.pessoas;


public class FactoryPessoa {

	// http://blog.triadworks.com.br/enums-sao-mais-que-constantes
	
	public PessoaAbstract getPessoa(String nome, Genero sexo) {

		PessoaAbstract nomePessoa = null;
		if (Genero.HOMEM.equals(sexo)) {
			nomePessoa = new Homem(nome);
		}
		if (Genero.MULHER.equals(sexo)) {
			nomePessoa = new Mulher(nome);
		}
		return nomePessoa;
	}

}
