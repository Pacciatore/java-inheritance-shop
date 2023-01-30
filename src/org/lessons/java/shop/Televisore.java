package org.lessons.java.shop;

public class Televisore extends Prodotto {

	private float inches;
	private boolean smartTv;

	public Televisore(String _name, String _brand, float _price, int _vat, float _inches, boolean _smartTv) {
		super(_name, _brand, _price, _vat);
		this.inches = _inches;
		this.smartTv = _smartTv;
	}

	public float getInches() {
		return this.inches;
	}

	public void setInches(float _inches) {
		if (_inches > 0f)
			this.inches = _inches;
	}

	public boolean isSmartTv() {
		return this.smartTv;
	}

	public void setSmartTv(boolean _smartTv) {
		this.smartTv = _smartTv;
	}

}
