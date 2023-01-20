package org.zoho;
import java.util.HashMap;

public class RefString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String inputString = "Hello World Please";
		        String refString = "Help";
		        HashMap<Character, Integer> charCount = new HashMap<>();
		        for (int i = 0; i < refString.length(); i++) {
		            charCount.put(refString.charAt(i), 0);
		        }
		        for (int i = 0; i < inputString.length(); i++) {
		        	char c = inputString.charAt(i);
		            if (charCount.containsKey(c)) {
		                charCount.put(c, charCount.get(c) + 1);
		            }
		        }
		        
		        for (char c : charCount.keySet()) {
		            System.out.print(c + ":" + charCount.get(c) + ", ");
		        }
		    }
		}
		