
public class TesteSwitch1 {
	// Usado apenas quando tem valores específicos
	// If e Else são para situações mais complexas
	public static void main(String[] args) {
		int numero = 7;
		switch (numero) {
		case 1:
			System.out.println("variável numero igual a 1");
			break;
		case 2:
			System.out.println("variável numero igual a 2");
			break;
		default:
			System.out.println("variável numero é diferente de 1 e 2");
			break; //Poderia tirar o default, mas se tirar aqui o código não vai fazer nada
		}		  //Também poderia tirar o break do default, porque já está no final
	}

}