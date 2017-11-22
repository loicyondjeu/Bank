package de.bank.konto;

public class Konto {
	
	private String name, pin;
	private double kontostand;

	public Konto(String name, String pin) {
		this.name = name;
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public void einzahlen(double betrag) {
		this.kontostand += betrag;
	}

}
