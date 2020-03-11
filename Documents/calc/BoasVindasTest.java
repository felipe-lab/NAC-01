package br.fiap.calc;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoasVindasTest {

	@Test
	public void testBoasVindas() {

		String mensx;// Variavel para teste
		mensx = "Pedro,";// Inicializando a variavel

		BoasVindas mensagemUsuario = new BoasVindas(mensx);// Instanciando o objeto [BoasVindas] e passando o a String
															// como parametro
		String mensretorno = mensagemUsuario.Mensagem();// Instanciando o objeto [mensagemUsuario]

		System.out.println("Mensagem: " + mensretorno);

		assertEquals("Seja bem vindo a sua calculadora pessoal!", mensretorno);// Comparando se o objeto é igual a
																				// String em questão

	}

	@Test
	public void testExibirMenssagem() {

		String mensx;
		mensx = "Pedro,";

		BoasVindas mensagemUsuario = new BoasVindas(mensx);

		String mensRetorno;

		mensRetorno = mensagemUsuario.exibirMensagem();

		assertEquals(mensx, mensRetorno);

	}

}
