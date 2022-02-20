package com.capgemini.academy.teste01;



public class exercicio1 {

	public boolean desafio01 (String originalString, Integer n){
        String newString = "       ";
  
        if(originalString != null && n != null) {
        for (int i = n; i > 0; i--) {
        	newString += originalString.charAt(0);
        	newString = newString.substring(1);
        	System.out.println(newString);
        }
        return true;
    }
		return false;
        
	}

}


