import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double salarioAtual, novoSalario, aumento;
		int porcentagem;
		
		System.out.print("Funcionário, por favor digite seu salário atual: ");
		salarioAtual = scanner.nextDouble();
		
		if (salarioAtual <= 1000.0) {
			porcentagem = 20;
			aumento = salarioAtual * porcentagem / 100;
	        novoSalario = salarioAtual + aumento;
		} 
		else if (salarioAtual <= 3000.0) {
			porcentagem = 15;
			aumento = salarioAtual * porcentagem / 100;
	        novoSalario = salarioAtual + aumento;
		} 
		else if (salarioAtual <= 8000.0) {
			porcentagem = 10;
			aumento = salarioAtual * porcentagem / 100;
	        novoSalario = salarioAtual + aumento;
		} 
		else {
			porcentagem = 5;
			aumento = salarioAtual * porcentagem / 100;
	        novoSalario = salarioAtual + aumento; 
	    }
		
		System.out.printf("A partir de agora, o seu novo salário será de %.2f\n", novoSalario);
		System.out.printf("O seu aumento foi de %.2f\n", aumento);
		System.out.printf("E a porcentagem de %d %%", porcentagem);
		
		scanner.close();
	}

}
