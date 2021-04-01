package factoryMethod.pessoas;

public class Mulher extends PessoaAbstract {
	public Mulher(String nome) {
		this.nome = nome;
		System.out.println("Olá Senhora " + this.nome);
	}
}
