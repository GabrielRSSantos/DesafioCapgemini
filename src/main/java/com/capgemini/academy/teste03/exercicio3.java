package com.capgemini.academy.teste03;
import java.util.Arrays;
import java.util.HashMap;
  
public class exercicio3 {
  
    public boolean anagrama(String palavra){
        HashMap<String, Integer> map= new HashMap<>();
  
        for(int i = 0; i < palavra.length(); i++){
        	
            for(int j = i; j < palavra.length(); j++){
            	
                char[] array = palavra.substring(i, j+1).toCharArray();
                Arrays.sort(array);
                String value = new String(array);
                
                if (map.containsKey(value)) 
                    map.put(value, map.get(value)+1);
                else 
                    map.put(value, 1);
            }
        }
        int isAnagrama = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            isAnagrama += (n * (n-1))/2;
        }
        System.out.println(isAnagrama);
        return true;
    }
}