		// <inicialização de variável>; <condição>; <incremento ou decremento>){
		//<instruções a serem executadas>
public class TesteFor1 {

	public static void main(String[] args) {
		for (int x=0; x<=3; x++) {
			System.out.println("x = " + x);
		}
		
		
		//a linha abaixo não compila porque variável x foi declarada (int x=0) dentro do for
		//System.out.println("Valor final de x = " + x);
		
		
		//escopo local:
		int y;

		//escopo de bloco:
		for (y = 3; y>=0 ; y--){
			System.out.println("y = " + y);
		}
		
		System.out.println("Valor final de  y= " + y);
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
