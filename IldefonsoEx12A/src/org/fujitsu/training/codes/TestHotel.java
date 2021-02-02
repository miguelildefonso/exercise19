package org.fujitsu.training.codes;

public class TestHotel {
	
	public static void main(String[] args) {
		Hotel hotel = new Hotel("Hotel1",new Room((double) 1000.00f, new Dimension(10f,20f),(byte)5));
		System.out.println(hotel.getName());
		System.out.println(hotel.getRoom());
	}

}
