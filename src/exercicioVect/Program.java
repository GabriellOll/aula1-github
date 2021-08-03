package exercicioVect;
import java.util.Locale;
import java.util.Scanner;

import entities.AluguelDeQuarto;

public class Program {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AluguelDeQuarto[] aluguel = new AluguelDeQuarto[10];
		
		System.out.println("Informe o número de quartos a serem alugados...:");
		byte numeroDeEntrada = sc.nextByte();
		
		for(int i = 0; i < numeroDeEntrada; i++) 
		{
			sc.nextLine();
			System.out.println("Aluguel número " + (i+1));
			System.out.println("Informe o nome:");
			String nome = sc.nextLine();
			
			System.out.println("Informe o email: ");
			String email = sc.nextLine();
			
			System.out.println("Informe o número do quarto: ");
			byte numeroDoQuarto = sc.nextByte();
			
			aluguel[numeroDoQuarto - 1] = new AluguelDeQuarto(nome, email);
	
		}
		
		System.out.println("Quartos ocupados:\n ");
		
		for(int i = 0; i < aluguel.length; i++) 
		{
			if(aluguel[i] != null) 
				System.out.println((i +1) + ": " + aluguel[i]);	
		}
		
		sc.close();
		

	}

}
