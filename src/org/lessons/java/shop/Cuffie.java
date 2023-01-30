package org.lessons.java.shop;

public class Cuffie extends Prodotto {

	private String color;
	private boolean wired;

	public Cuffie(String _name, String _brand, float _price, int _vat, String _color, boolean _wired) {
		super(_name, _brand, _price, _vat);
		this.color = _color;
		this.wired = _wired;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String _color) {
		this.color = _color;
	}

	public boolean isWired() {
		return this.wired;
	}

	public void setWired(boolean _wired) {
		this.wired = _wired;
	}

}
