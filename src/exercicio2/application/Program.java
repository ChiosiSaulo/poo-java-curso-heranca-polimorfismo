package exercicio2.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio2.entities.Contribuinte;
import exercicio2.entities.PessoaFisica;
import exercicio2.entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Contribuinte #" + i + " dados:");
			System.out.print("Pessoa Física ou Pessoa Jurídica (f/j)? ");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda: ");
			double renda = sc.nextDouble();
			if(c == 'f') {
				System.out.print("Gastos: ");
				double gastos = sc.nextDouble();
				list.add(new PessoaFisica(nome, renda, gastos));
			}else {
				System.out.print("Número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, renda, numeroFuncionarios));
			}
		}
		System.out.println();
		
		System.out.println("IMPOSTOS PAGOS: ");
		for(Contribuinte c : list) {
			System.out.println(c.getNome() + String.format(": $ %.2f", c.calcularImposto()));
		}
		
		System.out.println();
		double soma = 0.0;
		for(Contribuinte c : list) {
			soma += c.calcularImposto();
		}
		System.out.printf("IMPOSTO TOTAL: $ %.2f", soma);
		
		
		
		
		sc.close();
	}

}
