package texte;

public class ferramentas {

	void limpatela() {
		for (int i = 0; i < 100; ++i)  
		       System.out.println();
	}
	void contador() throws InterruptedException {
		Thread.sleep(500);
		System.out.print("3");
		Thread.sleep(500);
		System.out.print("...");
		Thread.sleep(500);
		System.out.print("2");
		Thread.sleep(500);
		System.out.print("...");
		Thread.sleep(500);
		System.out.print("1");
		Thread.sleep(500);
	}
}
