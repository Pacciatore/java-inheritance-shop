package org.lessons.java.shop;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

	private int id;
	private String name;
	private String brand;
	private float price;
	private int vat; // valore assoluto della percentuale IVA

	public Prodotto(String _name, String _brand, float _price, int _vat) {
		this.id = getRandomID();
		this.name = _name;
		this.brand = _brand;
		this.price = _price;
		this.vat = _vat;
	}

	// ID
	private int getRandomID() {

		Random r = new Random();

		int randomID = r.nextInt(10000000);

		return randomID;
	}

	public String getID() {
		return String.valueOf(this.id);
	}

	// Name
	public String getName() {
		return this.name;
	}

	public void setName(String _name) {
		if (_name.trim().length() > 0)
			this.name = _name;
	}

	// Brand
	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String _brand) {
		if (_brand.trim().length() > 0)
			this.brand = _brand;
	}

	// Price
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float _price) {
		this.price = _price;
	}

	public void setPrice(int _price) {
		this.price = (float) _price;
	}

	public String getPriceFormatted() {

		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_EVEN);

		return df.format(this.price);
	}

	public String getPriceFormattedWithVat() {

		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_EVEN);

		float vatPercentage = (float) vat / 100;
		float vatCost = this.price * vatPercentage;

		float vatPrice = this.price + vatCost;

		return df.format(vatPrice);
	}

	public float getPriceWithVat() {

		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_EVEN);

		float vatPercentage = (float) vat / 100;
		float vatCost = this.price * vatPercentage;

		float vatPrice = this.price + vatCost;

		return vatPrice;
	}

	// VAT
	public int getVat() {
		return this.vat;
	}

	public void setVat(int _vat) {
		if (_vat > 0 && _vat < 100)
			this.vat = _vat;
	}

}
