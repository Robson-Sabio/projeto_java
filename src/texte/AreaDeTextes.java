package texte;

import java.util.Scanner;

public class AreaDeTextes {

	public static void main(String[] args) {
		
		for(int i = 0 ; i<3 ; i++) {
		int media = 5 ,nota;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("insira a sua nota: ");
		nota = leitor.nextInt();
		
		if (nota > media) {
			System.out.println("vc passou!");
		}else if (nota == media) {
			System.out.println("vc esta de recuperacao!");
			
		}else {
			System.out.println("vc reprovou!");
		}
		}
		System.out.println("fim do programa!!!");
	}
}
