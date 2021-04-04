package factoryMethod.pessoas.test;

import org.junit.jupiter.api.Test;
import factoryMethod.pessoas.FactoryPessoa;
import factoryMethod.pessoas.Genero;

class TestApp {

	@Test
	void testFactoryPessoa() {
		FactoryPessoa Pessoa1 = new FactoryPessoa();
		Pessoa1.getPessoa("Ronison", Genero.HOMEM);
		
		FactoryPessoa Pessoa2 = new FactoryPessoa();
		Pessoa2.getPessoa("Maria", Genero.MULHER);

	}

}
