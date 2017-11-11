package de.bank.konto;

import junit.framework.TestCase;

public class KontoTest extends TestCase {
	
	public void testAccountCreation(){
		Konto testAccount = new Konto("Loic", "1234");
		testAccount.einzahlen(1000.0);
		assertEquals(1000.0, testAccount.getKontostand());
	}

}
