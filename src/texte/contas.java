package texte;

import java.util.Scanner;

public class contas {
	
	Scanner leitor = new Scanner(System.in);
	
	float n1;
	float n2;
	float n3;

	void Somar (){
		System.out.println("Escolha dois numeros para somar.");
		n1 = leitor.nextInt();
	    n2 = leitor.nextInt();
	    n3 = n1 + n2;
		System.out.println("\nSoma : (" + n3 + ")");
	}
	void Subitracao (){
		System.out.println("Escolha dois numeros para dividir.");
		n1 = leitor.nextInt();
	    n2 = leitor.nextInt();
	    n3 = n1 - n2;
	    System.out.println("Subitracao : (" + n3 + ")");
	}
	void Mutiplicacao (){
		System.out.println("Escolha dois numeros para mutiplicar.");
		n1 = leitor.nextInt();
	    n2 = leitor.nextInt();
	    n3 = n1 * n2;
	    System.out.println("Mutiplicacao : (" + n3 + ")");
	}
	void Divisao (){
		System.out.println("Escolha dois numeros para dividir.");
		n1 = leitor.nextInt();
	    n2 = leitor.nextInt();
	    n3 = n1 / n2;
	    System.out.println("Divisao : (" + n3 + ")");
	}
	
	
	
	
}
