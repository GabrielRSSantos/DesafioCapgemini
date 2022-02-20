package com.capgemini.academy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.academy.teste02.exercicio2;

public class exercicio2Test {
	
	 @Test
	  public void TestExercicio1()
	  {
		 
		 exercicio2 teste = new exercicio2();
		 
		 boolean result = teste.isValid("G@br1el");
		 
	   assertEquals(true, result);
	  }

}
