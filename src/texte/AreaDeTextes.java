package texte;

import java.util.Scanner;

public class AreaDeTextes {

	public static void main(String[] args) {
		
		contas c1 = new contas ();
		ferramentas f1 = new ferramentas();
		try (Scanner leitor = new Scanner(System.in)) {
			boolean desligar = false;
			while(desligar==false) {
			boolean repetidor = false;
			while(repetidor == false){
			System.out.println("---- Operacoes matematicas ----"
				           + "\n 0- desligar calculadora."
				           + "\n"
					       + "\n 1- soma"
					       + "\n 2- subitracao"
					       + "\n 3- mutiplicacao"
					       + "\n 4- divisao"
					       + "\n\n Escolha uma operacao :");
			int escolha = leitor.nextInt();
			
			
			switch(escolha) {
			case 0:
				f1.limpatela();
				System.out.println("desligando!!!");
				f1.contador();
				f1.limpatela();
				desligar = true;
				repetidor = true;
				break;
			case 1:
				repetidor = true;
				f1.limpatela();
				c1.Somar();
				System.out.println("");
				break;
			case 2:
				repetidor = true;
				f1.limpatela();
				c1.Subitracao();
				System.out.println("");
				break;
			case 3:
				repetidor = true;
				f1.limpatela();
				c1.Mutiplicacao();
				System.out.println("");
				break;
			case 4:
				repetidor = true;
				f1.limpatela();
				c1.Divisao();
				System.out.println("");
				break;
			default:
				System.out.println("Resposta invalida!!!");
				f1.contador();
				f1.limpatela();
			}
			}
			}
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());

		} finally {
			System.out.println("\n-------------Fim do programa!!!-------------;");
		}

		
	}

}
