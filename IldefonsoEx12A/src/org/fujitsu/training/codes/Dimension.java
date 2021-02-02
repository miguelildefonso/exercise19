package org.fujitsu.training.codes;

public class Dimension {
	
	private Float length;
	private Float width;
	
	public Dimension() {
		this(20f, 10f);
	}
	
	public Dimension(Float length, Float width) {
		this.length = length;
		this.width = width;
		
	}

	public Float getLength() {
		return length;
	}

	public void setLength(Float length) {
		this.length = length;
	}

	public Float getWidth() {
		return width;
	}

	public void setHeight(Float width) {
		this.width = width;
	}
	
	

}
