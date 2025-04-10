
public class TesteBreakContinue1 {

	public static void main(String[] args) {
		// Imprime números primos entre 1 e 10
		int numero;
		int contador;
		int resto;
		int numDivisores;
		int totalNumeros = 10;
		for (numero=2; numero<=totalNumeros; numero++) {//FOR porque tem número definido de repetições 
			//Número 1 não é primo
			numDivisores = 0;
			contador = 1;
			while (contador<=numero) { //WHILE pois não sabe quando vai acabar
				resto = numero % contador;
				if (resto==0) {
					numDivisores++;
					if (numDivisores > 2) { // Não é primo
						break; // Sai do loop
						// BREAK ajuda na performance
					}
				}
				contador++;
			}
			if (numDivisores>2)
				continue; // Não seguirá para a linha abaixo, volta ao inicio e continua para o próximo número do laço
			System.out.println(numero + " é um número primo.");
		}
	}

}
/*
 * 
 *
 * 
 * 
 * 
 * 
 * 
 */
