package de.bank.konto;

import junit.framework.TestCase;

public class KontoTest extends TestCase {
	
	public void testAccount(){
		Konto testAccount = new Konto("Loic", "geheim");
		testAccount.einzahlen(1000.0);
		assertEquals(1000.0, testAccount.getKontostand());
	}
	
	public void testdummyMethod(){
		Konto kontoTest = new Konto("dummy", "1234");
		assertEquals("5000000000.0", kontoTest.getKontostand());
	}
}
