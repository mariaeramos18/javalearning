
public class TesteOperadoresIncrementoDecremento1 {

	public static void main(String[] args) {
		System.out.println("Pré-fixado");
		int x = 5 ;
		System.out.println("x = " + x);
		System.out.println("++x = " + ++x);
		System.out.println("x =" + x);
		System.out.println("--x = " + --x);
		System.out.println("x = " + x);
		System.out.println("Pós-fixado");
		System.out.println("x++ = " + x++);
		System.out.println("x = " + x);
		System.out.println("x-- = " + x--);
		System.out.println("x = " + x);
		
		System.out.println("________________________");
		System.out.println("Testando com numero negativo");		
		
		System.out.println("Pré-fixado");
		int y = -5 ;
		System.out.println("y = " + y);
		System.out.println("++y = " + ++y);
		System.out.println("y =" + y);
		System.out.println("--y = " + --y);
		System.out.println("y = " + y);
		System.out.println("Pós-fixado");
		System.out.println("y++ = " + y++);
		System.out.println(" = " + y);
		System.out.println("y-- = " + y--);
		System.out.println("y = " + y);
	}

}
