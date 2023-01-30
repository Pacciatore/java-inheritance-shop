package org.lessons.java.shop;

public class Televisore extends Prodotto {

	private float inches;
	private boolean smartTv;

	public Televisore(String _name, String _brand, float _price, int _vat, float _inches, boolean _smartTv) {
		super(_name, _brand, _price, _vat);
		this.inches = _inches;
		this.smartTv = _smartTv;
	}

}
