package br.fiap.calc;

public class BoasVindas {

	private String mensagem;

	// Construtor de Objeto na Classe
	public BoasVindas(String mens) {
		this.mensagem = mens;
	}

	// Exibi��o da mensagem
	public String exibirMensagem() {
		System.out.println(this.mensagem);
		return this.mensagem;
	}

	// Exibi��o da parte fixa da mensagem
	public String Mensagem() {
		String mens;
		mens = "Seja bem vindo a sua calculadora pessoal!";
		System.out.println(mens);
		return mens;
	}

}
