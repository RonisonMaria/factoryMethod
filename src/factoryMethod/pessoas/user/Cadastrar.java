package factoryMethod.pessoas.user;

import java.util.Date;

public class Cadastrar {
	
	UserAbstract cadastro = null;
	
	public UserAbstract getUser(String firstName, String lastName, Date dateOfBirth, String email, Category category,
			String cpf, String telefone, String endereco, PermissionType permissionType) {

		cadastro.setFirstName(firstName);
		cadastro.setLastName(lastName);
		cadastro.setDateOfBirth(dateOfBirth);
		cadastro.setEmail(email);
		cadastro.setCategory(category);
		cadastro.setCpf(cpf);
		cadastro.setTelefone(telefone);
		cadastro.setEndereco(endereco);
		cadastro.setPermissionType(permissionType);
		
		if(Category.PROFESSIONAL.equals(category)) {
			cadastro = new Professional(cadastro);
		}
		
		if(Category.PATIENT.equals(category)) {
			cadastro = new Professional(cadastro);
		}
		
		return cadastro;
	}


}
