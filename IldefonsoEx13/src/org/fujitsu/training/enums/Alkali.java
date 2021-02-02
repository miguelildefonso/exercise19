package org.fujitsu.training.enums;

public enum Alkali {
	
	LITHIUM("Li",(byte) 3),
	SODIUM("Na",(byte) 11),
	POTASSIUM("K",(byte) 19),
	RUBIDIUM("Rb",(byte) 37),
	CESIUM("Cs",(byte) 55),
	FRANCIUM("Fr",(byte) 87);

	private String symbol;
	private byte atomicNum;
	
	Alkali(String symbol, byte atomicNum) {
		this.symbol = symbol;
		this.atomicNum = atomicNum;
	}

	public byte getAtomicNum() {
		return atomicNum;
	}

	public String getSymbol() {
		return symbol;
	}

}
