package factoryMethod.pessoas;

public class Homem extends PessoaAbstract {
	public Homem(String nome) {
		this.nome = nome;
		System.out.println("Ol� Senhor " + this.nome);
	}		
}
