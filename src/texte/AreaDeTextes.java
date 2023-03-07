package texte;

import java.util.Scanner;

public class AreaDeTextes {

	public static void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {
			for (int i = 0; i < 3; i++) {

				System.out.print("insira a sua nota: ");
				int nota = leitor.nextInt();
				int media = 5;
				if (nota > media) {
					System.out.println("vc passou!");
				} else if (nota == media) {
					System.out.println("vc esta de recuperacao!");

				} else {
					System.out.println("vc reprovou!");
				}
			}
		}

		System.out.println("fim do programa!!!");
	}
}
