package org.fujitsu.training.enums;

public class TestElements {
	
	public static void main (String[] args) {
		
		System.out.println(Alkali.CESIUM.name());
		System.out.println(Alkali.CESIUM.getSymbol());
		System.out.println(Alkali.CESIUM.getAtomicNum());
		
		System.out.println(Metals.ALUMINUM.name());
		System.out.println(Metals.ALUMINUM.getSymbol());
		System.out.println(Metals.ALUMINUM.getAtomicNum());
		
		System.out.println(Transition.GOLD.name());
		System.out.println(Transition.GOLD.getSymbol());
		System.out.println(Transition.GOLD.getAtomicNum());		
	}
}
