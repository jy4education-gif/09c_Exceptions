package com.cc.java;

public class App {

	public static void main(String[] args) {
		
		String str;  
		char ch; // Character
		
		try 
		{		
			str = "Irgendein Random String";  // String Errpr -> str = null NullPointer Exception
			System.out.println("Stringlänge :" + str.length());
			
			ch = str.charAt(0); // Error -> str.length()
			System.out.println("Character :" + ch);	
		} 
		catch (StringIndexOutOfBoundsException e) {
			// Fehlerbehandlung ...
			System.out.println("Index Fehler, bitte Eingabe prüfen!");		
		}
		catch (Exception e) {
			// Weitere Fehler-Routinen ....
			System.out.println("Uiuiuiuiuiu!!!  Bitte Eingabe dringend prüfen!");
		}
		
		
	}

}
