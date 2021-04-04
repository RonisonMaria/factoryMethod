package factoryMethod.pessoas.user;

public class Professional extends UserAbstract {
	
	public Professional(UserAbstract user) {
		
		this.firstName = user.firstName;
		this.lastName = user.lastName;
		this.dateOfBirth = user.dateOfBirth;
		this.email = user.email;
		this.category = user.category;
		this.cpf = user.cpf;
		this.telefone = user.telefone;
		this.endereco = user.endereco;
		this.permissionType = user.permissionType;
		
		System.out.println("Nome " + firstName + " Categoria " + category);
	}
}
