public class Main {

	static Login login = Login.getInstance();
	static Usuarios usuarios = Usuarios.getInstance();

	public static void main(String[] args) {
		usuarios.adicionaUsuario("Manuel", "matriculateste", "senhateste", "Gerente");
		login.exibeLogin();
	}

}