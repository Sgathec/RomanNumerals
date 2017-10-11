import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void testOne() {
		RomanNumeral rn = new RomanNumeral("I");
		assertEquals(1, rn.toInteger());
	}
	
	@Test
	public void testTwo() {
		RomanNumeral rn = new RomanNumeral("II");
		assertEquals(2, rn.toInteger());
	}
	
	@Test
	public void testThree() {
		RomanNumeral rn = new RomanNumeral("III");
		assertEquals(3, rn.toInteger());
	}
	
	@Test
	public void testFour() {
		RomanNumeral rn = new RomanNumeral("IV");
		assertEquals(4, rn.toInteger());
	}
	
	@Test
	public void testFive() {
		RomanNumeral rn = new RomanNumeral("V");
		assertEquals(5, rn.toInteger());
		
	}
	
	@Test
	public void testSix() {
		RomanNumeral rn = new RomanNumeral("VI");
		assertEquals(6, rn.toInteger());
		
	}
	
	@Test
	public void testSeven() {
		RomanNumeral rn = new RomanNumeral("VII");
		assertEquals(7, rn.toInteger());
		
	}
	
	@Test
	public void testNine() {
		RomanNumeral rn = new RomanNumeral("IX");
		assertEquals(9, rn.toInteger());
		
	}
	
	@Test
	public void testTen() {
		RomanNumeral rn = new RomanNumeral("X");
		assertEquals(10, rn.toInteger());
		
	}

	@Test
	public void testEleven() {
		RomanNumeral rn = new RomanNumeral("XI");
		assertEquals(11, rn.toInteger());
		
	}
	@Test
	public void testTwelve() {
		RomanNumeral rn = new RomanNumeral("XII");
		assertEquals(12, rn.toInteger());
		
	}
	
	@Test
	public void testTwenty() {
		RomanNumeral rn = new RomanNumeral("XX");
		assertEquals(20, rn.toInteger());
		
	}
	
	@Test
	public void testThirty() {
		RomanNumeral rn = new RomanNumeral("XXX");
		assertEquals(30, rn.toInteger());
		
	}
	
	@Test
	public void testForty() {
		RomanNumeral rn = new RomanNumeral("XL");
		assertEquals(40, rn.toInteger());
		
	}
	
	@Test
	public void testNineteenEightyFour() {
		RomanNumeral rn = new RomanNumeral("MCMLXXXIV");
		assertEquals(1984, rn.toInteger());
		
	}
	@Test
	public void testTwentyFourteen() {
		RomanNumeral rn = new RomanNumeral("MMXIV");
		assertEquals(2014, rn.toInteger());
		
	}
	@Test
	public void testSevenThousandEightHundredAndTwo() {
		RomanNumeral rn = new RomanNumeral("MMMMMMMDCCCII");
		assertEquals(7802, rn.toInteger());
		
	}
}
