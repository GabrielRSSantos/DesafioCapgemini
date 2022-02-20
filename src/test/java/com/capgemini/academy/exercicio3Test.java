package com.capgemini.academy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.academy.teste03.exercicio3;

public class exercicio3Test {
	
	 @Test
	  public void TestExercicio1()
	  {
		 
		 exercicio3 teste = new exercicio3();
		 
		 boolean result = teste.anagrama("ifailuhkqq");
		 
	   assertEquals(true, result);
	  }

}
