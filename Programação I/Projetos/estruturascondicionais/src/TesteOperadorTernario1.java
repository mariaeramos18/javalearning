
public class TesteOperadorTernario1 {
	//OPERADOR *TERNÁRIO* PORQUE TEM 3 PARTES
	
	public static void main(String[] args) {
		int idade = 20;
		System.out.println("idade = " + idade);
		System.out.println(idade >= 18 ? "Adulto" : "Não é adulto");
		boolean votante;
		votante = (idade >= 16) ? true : false; //Quando votante receber true
		System.out.println(votante ? "Pode votar!" : "Não pode votar" ); // """votante ?""" é true
	}
		
}
// todo lugar onde puder colocar uma condição, voce pode colocar no lugar da condição, uma variável booleana
		// System.out.println((idade>=16)?"Pode votar!":"Não pode votar");
		// não ia precisar da variável votante

//condição ?  se for verdadeiro : se for falso;