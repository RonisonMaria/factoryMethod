package factoryMethod.pessoas.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import factoryMethod.pessoas.FactoryPessoa;

class TestApp {

	@Test
	void testFactoryPessoa() {
		FactoryPessoa Pessoa1 = new FactoryPessoa();
		Pessoa1.getPessoa("Ronison", "M");
		
		FactoryPessoa Pessoa2 = new FactoryPessoa();
		Pessoa2.getPessoa("Maria", "F");

	}

}
