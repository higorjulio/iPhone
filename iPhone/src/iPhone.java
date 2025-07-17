
public class iPhone implements MusicPlayer, SmartPhone, Browser{
	private String musicaAtual;
	
	public iPhone() {
	}
	
	@Override
	public void exibirPagina(String url) {
		
	}

	@Override
	public void adicionarNovaAba() {
		
	}

	@Override
	public void atualizarPagina() {
		
	}

	
	
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + " ... Aguarde!");
	}

	@Override
	public void atender() {
		System.out.println("Chamada atendida");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz");
	}

	
	
	
	@Override
	public void tocar() {
		if(musicaAtual == null || musicaAtual.isEmpty()) {
			System.out.println("Nenhuma música selecionada");
		} else {
			System.out.println("Tocando a música: " + musicaAtual);
		}
	}

	@Override
	public void pausar() {
		if(musicaAtual == null || musicaAtual.isEmpty()) {
			System.out.println("Nenhuma música para pausar");
		} else {
			System.out.println("Música pausada");
		}
	}

	@Override
	public void selecionarMusica(String musica) {
		this.musicaAtual = musica;
		System.out.println("Música selecionada: " + musica);
	}

	
	
}
