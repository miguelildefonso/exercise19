package org.fujitsu.training.enums;

public enum Transition{
	
	SCANDIUM("Sc",(byte) 21),
	TITANIUM("Ti",(byte) 22),
	VANADIUM("V",(byte) 23),
	CHROMIUM("Cr",(byte) 24),
	MANGANESE("Mn",(byte) 25),
	IRON("Fe",(byte) 26),
	COBALT("Co",(byte) 27),
	NICKEL("Ni",(byte) 28),
	COPPER("Cu",(byte) 29),
	ZINC("Zn",(byte) 30),
	GALLIUM("Ga",(byte) 31),
	YTTRIUM("Y",(byte) 39),
	ZIRCONIUM("Zr",(byte) 40),
	NIOBIDIUM("Nb",(byte) 41),
	MOLYBDENUM("Mo",(byte) 42),
	TECHNITIUM("Tc",(byte) 43),
	RUTHENIUM("Ru",(byte) 44),
	RHODIUM("Rh",(byte) 45),
	PALLADIUM("Pd",(byte) 46),
	SILVER("Ag",(byte) 47),
	CADMIUM("Cd",(byte) 48),
	HAFNIUM("Hf",(byte) 72),
	TANTALUM("Ta",(byte) 73),
	TUNGSTEN("W",(byte) 74),
	RHENIUM("Re",(byte) 75),
	OSMIUM("Os",(byte) 76),
	IRIDIUM("Ir",(byte) 77),
	PLATINUM("Pt",(byte) 78),
	GOLD("Au",(byte) 79),
	MERCURY("Hg",(byte) 80),
	RUTHERFORDIUM("Rf",(byte) 104),
	DUBNIUM("Db",(byte) 105),
	SEABORGIUM("Sg",(byte) 106),
	BOHRIUM("Bh",(byte) 107),
	HASSIUM("Hs",(byte) 108),
	MEITNERIUM("Mt",(byte) 109),
	DARMSTADIUM("Ds",(byte) 110),
	REOENTGENIUM("Rg",(byte) 111),
	COPERNICIUM("Cn",(byte) 112);
	
	private String symbol;
	private byte atomicNum;
	
	Transition(String symbol, byte atomicNum) {
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
