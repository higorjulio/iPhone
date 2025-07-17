import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	iPhone iphone = new iPhone();
	Scanner scanner = new Scanner(System.in);
	int option;
	
	System.out.println("=====iPhone=====");
	System.out.println("1 - Selecionar Música");
	System.out.println("2 - Tocar música");
	System.out.println("3 - Pausar música");
	System.out.println("4 - ");
	System.out.println("5 - ");
	System.out.println("6 - ");
	System.out.println("7 - ");
	System.out.println("8 - ");
	System.out.println("9 - ");
	System.out.println("0 - ");
	
	while(true) {
		
		option = scanner.nextInt();
		switch(option) {
		case 1 -> {
			System.out.println("Digite a música");
			scanner.nextLine();
			String musica = scanner.nextLine();
			iphone.selecionarMusica(musica);
		}
		case 2 -> iphone.tocar();
		case 3 -> iphone.pausar();
		case 0 -> {scanner.close(); break;}
		default -> System.out.println("Opção inválida!");
		}
		
	}
	
}
}
