public class TesteConversaoVariaveis1 {

	public static void main(String[] args) {
		// Conversão implícita de tipo
		int a = 5;
		float b = 10.5f; // Precisa colocar a letra f para que seja considerado float
		b = a;
		// Conversão explícita de tipo
		int c = (int) b; // Exemplo de Cast
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}

}