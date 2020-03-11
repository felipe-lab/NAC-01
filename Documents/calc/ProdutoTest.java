package br.fiap.calc;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ProdutoTest {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testGetPeso() {
		Produto pr = new Produto(75, 180);
		int resultadoEsperado = 75;
		int resultadoReal = pr.getPeso();
		System.out.println("\nProduto----------------");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testSetPeso() {
		Produto pr = new Produto();
		// set eh void
		pr.setPeso(75);
		int resultadoEsperado = 75;
		int resultadoReal = pr.getPeso();
		assertEquals(resultadoEsperado, resultadoReal);

	}

	@Test
	public void testGetAltura() {
		Produto pr = new Produto(75, 180);
		int resultadoEsperado = 180;
		int resultadoReal = pr.getAltura();
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testSetAltura() {
		Produto pr = new Produto();
		pr.setAltura(180);
		int resultadoEsperado = 180;
		int resultadoReal = pr.getAltura();
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
