package cript_object;

import java.util.ArrayList;

public class CriptObject {

	private String message;
	private String messageTwo;
	private String codedMessage;
	private ArrayList<String> codeType = new ArrayList<>();
	private String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz_0123456789!?.,";
	
	
	public CriptObject(String message) {
		this.message = message;
		this.codedMessage = message;
	}
	public CriptObject(String message, String messageTwo) {
		this.message = message;
		this.codedMessage = message;
		this.messageTwo = messageTwo;
	}
	
	public String getMessage() {return this.message;}
	public String getCodedMessage() {return this.codedMessage;}
	public String getAlphabet() {return this.alphabet;}	
	
	public void getCodes() {
		System.out.println("Log:");
		if(codeType.isEmpty()) {System.out.println("No changes made");} 
		else {
			for(String s : codeType) {
				System.out.println(s);
			}
		}
	}
	
	public void codedCaesar() {codeType.add("+ Caesar");}
	public void decodedCaesar() {codeType.add("- Caesar");}
	public void codedMono() {codeType.add("+ Monoalfabetico");}
	public void decodedMono() {codeType.add("- Monoalfabetico");}
	public void codedNum() {codeType.add("+ Numeracion");}
	public void decodedNum() {codeType.add("- Numeracion");}
	
	public void Caesar() {
		
		String var = "";
		int suma = 0;
		int res=0;
		
		for(int i=0;i<getMessage().length();i++) {
			for(int j=0;j<alphabet.length();j++)
			{
				if(getMessage().charAt(i) == alphabet.charAt(j)) {
					suma = j+13;
					if(suma > 67) {
						for (int x = 0; x < 67; ++x) {
						    suma += 13;
						    suma = (suma - 0) % (67 - 0) + 0;
						}
					} var+=Character.toString(alphabet.charAt(suma));
				}
			}
		} this.codedMessage = var;
	}
	
	public void _Caesar() {
		
		String var = "";
		int suma = 0;
		int res=0;
		
		for(int i=0;i<getCodedMessage().length();i++) {
			for(int j=0;j<alphabet.length();j++)		{
				if(getCodedMessage().charAt(i) == alphabet.charAt(j)) {
					suma = j+54;
					if(suma > 17) {
						for (int x = 0; x < 67; ++x) {
						    suma += 13;
						    suma = (suma - 0) % (67 - 0) + 0;
						}
					} var+=Character.toString(alphabet.charAt(suma));
				}
			}
		} this.codedMessage = var;
	
	}
	
	public String Monoalfabetic() {
		String aux = "";
		
		for(int i=0;i<getMessage().length();i++) {
			if(!aux.contains(Character.toString(getMessage().charAt(i)))) {
				aux+=getMessage().charAt(i);
			}
		}
		System.out.println(aux);
		String copy = alphabet;
		
		for(int i=0;i<copy.length();i++) {
			for(int j=0;j<aux.length();j++) {
				if(copy.charAt(i) == aux.charAt(j)) {
					copy = copy.replace(Character.toString(aux.charAt(j)), "");
				}
			}
		}
		
		copy += aux;
		System.out.println(copy);
		
		int hor = aux.length();
		
		int ver = (int) Math.ceil( (float) copy.length() / (float) aux.length());
		
		char[][] map = new char[ver][hor];
				
		int inc = 0;
		
		for(int i = 0; i<ver; i++) {
			for(int j = 0; j<hor; j++) {
				System.out.print(copy.charAt(j+inc));
			} 
			inc += hor;
			System.out.println();
		}
		
		return(aux);
		
	}
	
	public String Numeracio() {
		String aux = "";
		for(int i=0;i<getMessage().length();i++) {
			if(!aux.contains(Character.toString(getMessage().charAt(i)))) {
				aux+=getMessage().charAt(i);
			}
		}
		
		int hor = aux.length();
		int ver = (int) Math.ceil( (float) messageTwo.length() / (float) aux.length());
		
		String copy = messageTwo += aux;
		
		char[][] map = new char[hor][ver];
		
		int inc = 0;
		
		for(int i = 0; i<hor; i++) {
			for(int j = 0; j<ver; j++) {
				System.out.print(copy.charAt(j+inc));
			} 
			inc += ver;
			System.out.println();
		}
		
		return(aux);
	}
}
