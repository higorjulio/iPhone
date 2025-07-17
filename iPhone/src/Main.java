import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	iPhone iphone = new iPhone();
	Scanner scanner = new Scanner(System.in);
	int option;
	
	System.out.println("=====iPhone=====");
	System.out.println("1 - Selecionar Música");
	System.out.println("2 - Tocar Música");
	System.out.println("3 - Pausar Música");
	System.out.println("4 - Ligar");
	System.out.println("5 - Atender");
	System.out.println("6 - Correio de Voz");
	System.out.println("7 - Exibir Página");
	System.out.println("8 - Nova Aba");
	System.out.println("9 - Atualizar Página");
	System.out.println("0 - Sair");
	
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
		case 4 -> {
			System.out.println("Digite o número para ligar");
			scanner.nextLine();
			String numero = scanner.nextLine();
			iphone.ligar(numero);
		}
		case 5 -> iphone.atender();
		case 6 -> iphone.iniciarCorreioVoz();
		case 7 -> {
			System.out.println("Digite o URL");
			scanner.nextLine();
			String url = scanner.nextLine();
			iphone.exibirPagina(url);
		}
		case 8 -> iphone.adicionarNovaAba();
		case 9 -> iphone.atualizarPagina();
		case 0 -> {scanner.close(); break;}
		default -> System.out.println("Opção inválida!");
		}
	}
	
}
}
