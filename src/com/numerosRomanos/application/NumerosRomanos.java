package com.numerosRomanos.application;

import java.util.HashMap;

/**
* Classe que trata da convers�o de n�meros indo-ar�bicos
* para o formato romano e vice-versa.
* @author Thiago Lucio Guariento.
* @since 28/11/2011
*/
public class NumerosRomanos {

	/**
	* M�todo onde inicia toda a opera��o de convers�o, recebe String 
	* tanto no formato de indo-arabico quanto no formato romano
	* e retorna o valor devidamente convertido.
	* @param entrada - String
	* @return retorno - String
	*/
	public static String converter(String entrada) {
		String retorno = "";

		if(isInt(entrada)){
			retorno = converteArabicoParaRomano(entrada);
		}
		else{
			retorno = converteRomanoParaArabico(entrada);
		}
		return retorno;
	}
	
	
	/**
	* M�todo respons�vel pela convers�o de indo-ar�bico para romano.
	* @param entrada - String
	* @return ret - String
	*/
	private static String converteArabicoParaRomano(String entrada){
		String ret ="";
		Integer i = Integer.parseInt(entrada);
		
		while (i / 1000 >= 1) {
			ret += "M";
			i = i - 1000;
		}
		if (i / 900 >= 1) {
			ret += "CM";
			i = i - 900;
		}
		if (i / 500 >= 1) {
			ret += "D";
			i = i - 500;
		}
		if (i / 400 >= 1) {
			ret += "CD";
			i = i - 400;
		}
		while (i / 100 >= 1) {
			ret += "C";
			i = i - 100;
		}
		if (i / 90 >= 1) {
			ret += "XC";
			i = i - 90;
		}
		if (i / 50 >= 1) {
			ret += "L";
			i = i - 50;
		}
		if (i / 40 >= 1) {
			ret += "XL";
			i = i - 40;
		}
		while (i / 10 >= 1) {
			ret += "X";
			i = i - 10;
		}
		if (i / 9 >= 1) {
			ret += "IX";
			i = i - 9;
		}
		if (i / 5 >= 1) {
			ret += "V";
			i = i - 5;
		}
		if (i / 4 >= 1) {
			ret += "IV";
			i = i - 4;
		}
		while (i >= 1) {
			ret += "I";
			i = i - 1;
		}
		return ret;
	}
	
	
	/**
	* M�todo respons�vel pela convers�o de romano para indo-ar�bico.
	* @param entrada - String
	* @return ret - String
	*/
	private static String converteRomanoParaArabico(String entrada){
		
		int ret = 0;
		HashMap simbolos = carregaSimbolos();
		int tamanho = entrada.length();
		if(tamanho > 0){
			ret = (Integer) simbolos.get(entrada.charAt(tamanho-1));
			for(int i = tamanho -1; i > 0; i--){
				int num1 = (Integer) simbolos.get(entrada.charAt(i));
				int num2 = (Integer) simbolos.get(entrada.charAt(i-1));

				if(num1 > num2){
					ret = ret  - num2;
				}
				else{
					ret = ret + num2;
				}
			}	
		}
		return ""+ret;
	}

	
	/**
	* M�todo que carrega um mapa com os s�mbolos romanos
	* e seus respectivos valores
	* @return simbolos - HashMap
	*/
	private static HashMap carregaSimbolos() {
		HashMap simbolos = new HashMap();
		simbolos.put('I', 1);
		simbolos.put('V',5);
		simbolos.put('X', 10);
		simbolos.put('L', 50);
		simbolos.put('C', 100);
		simbolos.put('D', 500);
		simbolos.put('M', 1000);
		return simbolos;
	}
	
	
	/**
	* Verifica se entrada � do tipo indo-ar�bico ou romano.
	* @param str - String
	* @return isInteger - boolean
	*/
	private static boolean isInt(String str) {  
		   boolean isInteger = true;  
		   try {  
		     Integer i = Integer.parseInt(str);  
		   } catch(NumberFormatException nfe) {  
		      isInteger = false;  
		   }  
		   return isInteger;  
		} 
}
