//while (<condição>) {
//<instruções a serem executadas>
//}

public class TesteWhile1 {

	public static void main(String[] args) {
		// escopo local
		int a = 11;
		
		// escopo de bloco
		while (a <= 3) {
			System.out.println("a = " + a);
			a++;
		}
		System.out.println("Valor final de a = " + a);
	}

}
/*		Tudo que faz no FOR pode fazer no WHILE  
 * 		
 * 		WHILE é mais flexivel então você está sujeito a mais erro
 * 			Repetição em número INdefinido de vezes
 * 			Se não for igual ao que o While quer, passa direto  
 * 			NÃO SABE SE VAI SE REPETIR E NÃO SABE SE VAI ENTRAR ALGUMA VEZ
 * 
 * 
 * 		FOR é uma quantidade fixa de vezes que vão se repetir
 * 			Repetição em número definido de vezes
 * 
 * 		DO WHILE
 * 			quando repetir algm coisa mais de uma vez
 * 			num indefindo de vezes, mas vai exibir pelo menos uma vez
 * 	
 * 			não tem condição para entrar 
 * 			acha condição no while
 */