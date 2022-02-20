package com.capgemini.academy;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.academy.teste01.exercicio1;


public class exercicio1Test {
	
	
	 @Test
	  public void TestExercicio1()
	  {
		 
		 exercicio1 teste = new exercicio1();
		 
		 boolean result = teste.desafio01("*", 6);
		 
	   assertEquals(true, result);
	  }
	

}
