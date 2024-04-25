
public class TesteIfElseIfElse2 {

	public static void main(String[] args) {
		double salarioBase = 30000;
		double ir = 0;
		
		if (salarioBase <= 2826.66) {
			ir = (salarioBase * 0.0) - 0.00;
		} 
		
		else if (salarioBase <= 3751.05) {
			ir = (salarioBase * 0.15) - 354.80;
		} 
		
		else if (salarioBase <= 4664.68) {
			ir = (salarioBase * 0.225) - 636.13;
		} 
		
		else {
			ir = (salarioBase * 0.275) - 869.36;
		}
		
		double salarioliq = salarioBase-ir;
		
		System.out.println("Imposto de renda do colaborador é igual a R$: " + ir);
		System.out.println("Salário líquido é igual a R$: " + salarioliq);
		
		System.out.println(salarioliq>=20000 ? "Salário de diretor" : "Salário de funcionário normal");
	
	}
}



