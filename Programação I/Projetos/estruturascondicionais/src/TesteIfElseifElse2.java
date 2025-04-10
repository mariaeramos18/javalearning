
public class TesteIfElseifElse2 {

	public static void main(String[] args) {
		double salarioBase = 3800;
		double aliquota = 0;
		double deducao = 0;
		
		if (salarioBase > 4664.68) {
			aliquota = 0.275;
			deducao = 869.36;
		} else if (salarioBase >= 3751.06) {
			aliquota = 0.225;
			deducao = 636.13;		
		} else if (salarioBase >= 2826.66) {
			aliquota = 0.15;
			deducao = 354.80;
		} else {
			aliquota = 0;
			deducao = 0;
		}
			
		double impostoDeRenda = (salarioBase * aliquota) - deducao;
		System.out.println("Seu imposto de renda é igual a " + impostoDeRenda);
		
		double salarioLiquido = salarioBase - impostoDeRenda;
		System.out.println("Seu salário líquido é igual a " + salarioLiquido);
		System.out.println(salarioLiquido > 20000 ? "Salário de diretor!" : "Salário de funcionário normal...");
	}

}