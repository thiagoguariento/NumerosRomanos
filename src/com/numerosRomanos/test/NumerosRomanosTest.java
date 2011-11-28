package com.numerosRomanos.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.numerosRomanos.application.NumerosRomanos;

public class NumerosRomanosTest {

	
	//INICIO TESTES -  INDO-ARABICO PARA ROMANO
	@Test
	public void testRetornaTodosOsSimbolos() {
		assertEquals( "I", NumerosRomanos.converter("1"));
		assertEquals( "V", NumerosRomanos.converter("5"));
		assertEquals( "X", NumerosRomanos.converter("10"));
		assertEquals( "L", NumerosRomanos.converter("50"));
		assertEquals( "C", NumerosRomanos.converter("100"));
		assertEquals( "D", NumerosRomanos.converter("500"));
		assertEquals( "M", NumerosRomanos.converter("1000"));
	}
	
	@Test
	public void testSubtrai_UM() {
		assertEquals( "IV", NumerosRomanos.converter("4"));
		assertEquals( "IX", NumerosRomanos.converter("9"));
		assertEquals( "XLIX", NumerosRomanos.converter("49"));
		assertEquals( "XCIX", NumerosRomanos.converter("99"));
		assertEquals( "DXCIX", NumerosRomanos.converter("599"));
		assertEquals( "CMXCIX", NumerosRomanos.converter("999"));
	}
	
	@Test
	public void testSoma_UM() {
		assertEquals( "VI", NumerosRomanos.converter("6"));
		assertEquals( "XI", NumerosRomanos.converter("11"));
		assertEquals( "XXI", NumerosRomanos.converter("21"));
		assertEquals( "CCCI", NumerosRomanos.converter("301"));
	}
	
	@Test
	public void testSoma_DOIS() {
		assertEquals( "VII", NumerosRomanos.converter("7"));
		assertEquals( "XII", NumerosRomanos.converter("12"));
		assertEquals( "XXII", NumerosRomanos.converter("22"));
		assertEquals( "CCCII", NumerosRomanos.converter("302"));
		assertEquals( "MII", NumerosRomanos.converter("1002"));
	}
	
	//FIM TESTES -  INDO-ARABICO PARA ROMANO
	
	
	
	
	
	//INICIO TESTES -  ROMANO PARA INDO-ARABICO
	@Test
	public void testRetornaTodosOsValores() {
		assertEquals( "1", NumerosRomanos.converter("I"));
		assertEquals( "5", NumerosRomanos.converter("V"));
		assertEquals( "10", NumerosRomanos.converter("X"));
		assertEquals( "50", NumerosRomanos.converter("L"));
		assertEquals( "100", NumerosRomanos.converter("C"));
		assertEquals( "500", NumerosRomanos.converter("D"));
		assertEquals( "1000", NumerosRomanos.converter("M"));
	}
	
	@Test
	public void testConverteParaRomano() {
		assertEquals( "7", NumerosRomanos.converter("VII"));
		assertEquals( "10", NumerosRomanos.converter("X"));
		assertEquals( "24", NumerosRomanos.converter("XXIV"));
		assertEquals( "34", NumerosRomanos.converter("XXXIV"));
		assertEquals( "989", NumerosRomanos.converter("CMLXXXIX"));
	}
	
	//FIM TESTES -  ROMANO PARA INDO-ARABICO
	

	



}