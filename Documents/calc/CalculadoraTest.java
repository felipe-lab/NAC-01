package br.fiap.calc;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		
		Calculadora calc = new Calculadora();// Instancia o objeto
		
		int nro1 = 5;//Valores para o teste
		int nro2 = 5;//Valores para o teste
		int resultadoEsperado = 10;//Resultado esperado
		int resultadoReal = calc.somar(nro1, nro2);//Objeto recebe o valores para serem testados
		
		System.out.println("\nSoma-----------");
		System.out.println("Resultado Esperado: " + resultadoEsperado);
		System.out.println("Resultado Obtido: " + resultadoReal);
		
		assertEquals(resultadoEsperado, resultadoReal);//Fun��o que compara se os valores s�o iguais
	}

	@Test
	public void testSubtrair() {
		
		Calculadora calc = new Calculadora();
		int nro1 = 5;
		int nro2 = 3;
		int resultadoEsperado = 2;
		int resultadoReal = calc.subtrair(nro1, nro2);
		
		System.out.println("\nSubtra��o-----------");
		System.out.println("Resultado Esperado: " + resultadoEsperado);
		System.out.println("Resultado Obtido: " + resultadoReal);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testMultiplicar() {
		
		Calculadora calc = new Calculadora();
		int nro1 = 3;
		int nro2 = 3;
		int resultadoEsperado = 9;
		int resultadoReal = calc.multiplicar(nro1, nro2);
		
		System.out.println("\nMultiplica��o-----------");
		System.out.println("Resultado Esperado: " + resultadoEsperado);
		System.out.println("Resultado Obtido: " + resultadoReal);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testDividir() {
		int nro1 = 6;
		int nro2 = 2;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 3;
		int resultadoReal = calc.dividir(nro1, nro2);
		System.out.println("\nDivis�o-----------");
		System.out.println("Resultado Esperado: " + resultadoEsperado);
		System.out.println("Resultado Obtido: " + resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
