package factoryMethod.pessoas;

public enum Genero {

	MULHER('M'), HOMEM('F');

	private char tipoGenero;

	Genero(char tipoGenero) {
		this.tipoGenero = tipoGenero;
	}

	public char getTipoGenero() {
		return tipoGenero;
	}
}
