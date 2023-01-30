package org.lessons.java.shop;

public class Smartphone extends Prodotto {

	private int imei;
	private double memoryCapacity; // On GigaBytes

	public Smartphone(String _name, String _brand, float _price, int _vat, int _imei, double _memoryCapacity) {
		super(_name, _brand, _price, _vat);
		this.imei = _imei;
		this.memoryCapacity = _memoryCapacity;
	}

	public String getImei() {
		return String.valueOf(this.imei);
	}

	public void setImei(String _imei) {
		if (_imei.length() == 15)
			this.imei = Integer.parseInt(_imei);
	}

	public double getMemoryCapacity() {
		return this.memoryCapacity;
	}

	public void setMemoryCapacity(int _memoryCapacity) {
		this.memoryCapacity = _memoryCapacity;
	}

}
