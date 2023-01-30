package org.lessons.java.shop;

public class Smartphone extends Prodotto {

	private int imei;
	private double memoryCapacity; // On GigaBytes

	public Smartphone(String _name, String _brand, float _price, int _vat, int _imei, double _memoryCapacity) {
		super(_name, _brand, _price, _vat);
		this.imei = _imei;
		this.memoryCapacity = _memoryCapacity;
	}

}
