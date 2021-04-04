package factoryMethod.pessoas.user.test;

import java.util.Date;

import org.junit.jupiter.api.Test;

import factoryMethod.pessoas.user.Cadastrar;
import factoryMethod.pessoas.user.Category;
import factoryMethod.pessoas.user.PermissionType;

class CadastroTest {

	

	@Test
	void test() {
		Cadastrar newCadastrar = new Cadastrar();
		Date now = new Date();
		newCadastrar.getUser("Ronison", "Matos", now, "ronison.matos@gmail.com", Category.PATIENT,
			"402.033.208-83", "47 91198471", "Rua Tuiuti", PermissionType.ADM);

	}

}
