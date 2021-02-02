package org.fujitsu.training.enums;

public enum Metals{
	
	ALUMINUM("Al",(byte) 13),
	INDIUM("In",(byte) 49),
	TIN("Sn",(byte) 50),
	THALLIUM("Tl",(byte) 81),
	LEAD("Pb",(byte) 82),
	BISMUTH("Bi",(byte) 83),
	NIHONIUM("Nh",(byte) 113),
	FLEROVIUM("Fl",(byte) 114),
	MOSCOVIUM("Mc",(byte) 115),
	LIVERMORNIUM("Lv",(byte) 116);
	
	private String symbol;
	private byte atomicNum;
	
	Metals(String symbol, byte atomicNum) {
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
