package com.capgemini.academy;


import com.capgemini.academy.teste01.exercicio1;
import com.capgemini.academy.teste02.exercicio2;
import com.capgemini.academy.teste03.exercicio3;


public class Main {		

	public static void main(String[] args) {	
		
		//Desafio 01
		exercicio1 fixo = new exercicio1();
		System.out.println(fixo.desafio01("*", 6));
		
		//Desafio 02
		exercicio2 fixo2 = new exercicio2();
		fixo2.isValid("G@br1el");
		
		//Desafio 03
		exercicio3 fixo3 = new exercicio3();
		fixo3.anagrama("ifailuhkqq");
}}
