
public class RomanNumeral {
	
	private String value;
	
	public RomanNumeral(String romanNum) {
		value = romanNum;
	}
	
	public int toInteger() {
		return toInteger(value);
		
	}
	
	public static int toInteger(String romanNum) {
		int result = 0;
		for(int i = 0; i < romanNum.length() + 1;) {
			System.out.println("i = " + i);
			int currentTokenValue = 0;
			int j = i;
			for(; j <= romanNum.length(); j++) {
				System.out.println("j = " + j);
				String currentChar = romanNum.substring(i, Math.min(j + 1, romanNum.length()));
				System.out.println("currentChar = " + currentChar);
				try {
					currentTokenValue = convertBasicNum(currentChar);
				} catch(RomanNumeralException e) {
					System.out.println("Exception thrown");
					break;
					
				}
				if(j == romanNum.length()) System.out.println("End of last loop");
			}
			i = j;
			result += currentTokenValue;
		}
		
		return result;
	}
	
	
	private static int convertBasicNum(String romanNum) throws RomanNumeralException{
		switch(romanNum) {
		case "I":	
			return 1;
		case "II":	
			return 2;
		case "III":	
			return 3;
		case "IV":	
			return 4;
		case "V":	
			return 5;
		case "VI":		
			return 6;
		case "VII":		
			return 7;
		case "IX":		
			return 9;
		case "X":		
			return 10;
		case "XL":
			return 40;
		case "L":
			return 50;
		case "LX":
			return 60;
		case "LXX":
			return 70;
		case "LXXX":
			return 80;
		case "XC":
			return 90;
		case "C":
			return 100;
		case "CC":
			return 200;
		case "CCC":
			return 300;
		case "CD":
			return 400;
		case "D":
			return 500;
		case "DC":
			return 600;
		case "DCC":
			return 700;
		case "DCCC":
			return 800;
		case "CM":
			return 900;
		case "M":
			return 1000;
		default:
			throw new RomanNumeralException();
		}
		
		
	}
}
